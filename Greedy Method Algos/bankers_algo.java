package DSA;

import java.util.*;

public class bankers_algo
{
    String resources[];
    int total[];
    int num_resources;
    String process[];
    int num_process;
    int allocation[][];
    int max_need[][];
    int available[];
    int need_rem[][];
    boolean included[];
    String order[];

    public bankers_algo(int nr, int np, String r[], String p[], int t[], int all[][], int maxn[][])
    {
        this.num_resources = nr;
        this.num_process = np;
        resources = new String[num_resources];
        for(int i=0;i<nr;i++)
            resources[i] = r[i];
        process = new String[num_process];
        for(int i=0;i<np;i++)
            process[i] = p[i];
        total = new int[nr];
        for(int i=0;i<nr;i++)
            total[i] = t[i];
        allocation = new int[np][nr];
        max_need = new int[np][nr];
        for(int i=0;i<np;i++)
        {
            for(int j=0;j<nr;j++)
            {
                allocation[i][j] = all[i][j];
                max_need[i][j] = maxn[i][j];
            }
        }
        available = new int[nr];
        need_rem = new int[np][nr];
        order = new String[np];
        included = new boolean[np];
        for(int i=0;i<np;i++)
            included[i] = false;
    }

    public void find_need()
    {
        // calculate rem_need
        for(int i=0;i<num_process;i++)
        {
            for(int j=0;j<num_resources;j++)
            {
                need_rem[i][j] = max_need[i][j] - allocation[i][j];
            }
        }
    }

    public void bankers()
    {
        int count = 0;
        
        int t_all[] = new int[num_resources];
        // find t_all
        for(int i=0;i<num_resources;i++)
        {
            for(int j=0;j<num_process;j++)
            {
                t_all[i] = t_all[i] + allocation[j][i];
            }
        }
        
        
        // find available
        for(int i=0;i<total.length;i++)
        {
            available[i] = total[i] - t_all[i];
        }
        
        while (count<num_process)   // loop for no of process times
        {
            boolean flag = false;
            for (int i = 0;i < num_process; i++)    // loop for iterating through processes
            {
                if (included[i] == false)   // if not included
                {
                    int j;
                    for (j = 0;j < num_resources; j++)
                    {       
                        if (need_rem[i][j] > available[j])  // check if each available instance of resource is greater than need
                            break;
                    }
                    if (j == num_resources)     
                    {
                        //include the process in order
                        order[count]=process[i];
                        count++;
                        included[i]=true;
                        flag=true;

                        for (j = 0;j < num_resources; j++)
                        {
                            // add to available after process is exceuted and allocated resources for that process are released
                            available[j] = available[j]+allocation[i][j];
                        }
                    }
                }
            }
            if (flag == false) // in one pass none of the process are executed then deadlock
            {
                break;
            }
        }
        if (count < num_process)
        {
            System.out.println("The System is Unsafe and there is a deadlock");
        }
        else
        {
            System.out.println("The given System is Safe and there is no deadlock");
            System.out.println("Following is the order: ");
            for (int i = 0;i < num_process; i++)
            {
                System.out.print(order[i]);
                if (i != num_process-1)
                    System.out.print(" -> ");
            }
        }

    }
    public static void main()
    {
        int n = 5;
        int m = 3;
        String r[] = {"a","b","c"};
        String p[] = {"p1", "p2","p3","p4","p5"};
        int t[] = {10,5,7};
        int a[][] = {{0,1,0},
                {2,0,0},
                {3,0,2},
                {2,1,1},
                {0,0,2}};
        int b[][] = {{7,5,3},
                {3,2,2},
                {9,0,2},
                {4,2,2},
                {5,3,3}};
        bankers_algo ob = new bankers_algo(m,n,r,p,t,a,b);
        ob.find_need();
        ob.bankers();
    }
}
