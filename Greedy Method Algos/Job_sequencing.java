package DSA;

import java.util.*;

/**
 * Job sequencing problem
 * Optimization: Maximize profit
 * Constraint: Complete within deadline
 */
public class Job_sequencing
{
    // J = job name array
    // P = profit array
    // D = Deadline array
    
    // deadline amounts are calculated from the start ex: from opening of the shop
    // assumption: profit array is sorted in descending order.
    public void job_sequencing(String J[], int P[], int D[], int n, int each)
    {
        // display the data
        // each = amount of time each process takes for completion
        display_qn(J,P,D);
        
        // soln array
        
        int max_time = max(D);
        String soln[] = new String[max_time];
        
        int profit = 0;
        
        for(int i=0;i<n;i++)
        {
            int j = D[i]-1;
            // find the latest vacant slot
            while(j>0 && soln[j] != null)
            {
                j--;
            }
            // insert into soln and perform task
            if(soln[j]==null)
            {
                soln[j] = J[i];
                profit += P[i];
            }
        }
        
        // display details
        System.out.println();
        System.out.print("Jobs :            ");
        display(soln);
        System.out.print("Time :            ");            
        for(int i=0;i<soln.length;i++)
        {
            System.out.print(i+"   ");  
        }
        System.out.println();
        System.out.println("Total time available = "+max_time+" units");
        System.out.println("Total no of tasks completed = "+soln.length+"/"+J.length);
        System.out.println("Optimized profit = "+ profit);
    }
    
    public int max(int a[])
    {
        int max = a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        return max;
    }
    
    public void display_qn(String J[], int P[], int D[])
    {
        System.out.println("Jobs:");
        display(J);
        System.out.println("Profit:");
        display(P);
        System.out.println("Deadline:");
        display(D);
    }
    
    public void display(String a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"  ");
        }
        System.out.println();
    }
    
    public void display(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"  ");
        }
        System.out.println();
    }
    
    public static void main()
    {
        String J[] = {"J1","J2","J3","J4","J5","J6","J7"};
        int P[] = {35,30,25,20,15,12,5};
        int D[] = {3,4,4,2,3,1,2};
        int n = 7;
        int each = 1;
        
        Job_sequencing ob = new Job_sequencing();
        ob.job_sequencing(J,P,D,n,each);
    }
}
