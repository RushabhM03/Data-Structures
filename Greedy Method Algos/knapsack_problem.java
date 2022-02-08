package DSA;

import java.util.*;

/**
 * Here we solve the knapsack problem
 * Optimization: maximize the cost without exceeding the capacity
 */

public class knapsack_problem
{
    int c;
    // O = object name array
    // P = profit array
    // W = weight array
    public void knapsack(int O[], int P[], int W[], int n, int capacity)
    {
        // display the arrays giiven in the question.
        display_qn(O,P,W);
        
        // CRITERIA: Find the profit by weight for each object
        double PbyW[] = new double[n];
        for(int i=0;i<n;i++)
        {
            PbyW[i] = (double)P[i]/W[i];
        }
        
        // consider the objects as divisible such as vegetables
        
        double soln[] = new double[n];
        
        while(capacity!=0)
        {
            c = 0;
            double maxPbyW = max(PbyW);
            if(W[c]<=capacity)
            {
                capacity -= W[c];
                PbyW[c] = 0;
                soln[c] = 1;
            }
            else
            {
                soln[c] = (double)capacity/W[c]; 
                capacity = 0;
            }
        }
        
        display(soln);
        
        // calculate total weight
        int weight=0;
        for(int i=0;i<n;i++)
        {
            weight += soln[i] * W[i];
        }
        System.out.println("Total weight = "+weight);
       
        
        // calculate total profit
        double profit=0;
        for(int i=0;i<n;i++)
        {
            profit += soln[i] * P[i];
        }
        System.out.println("Total profit = "+profit);
        
        // answer
        for(int i=0;i<n;i++)
        {
            if(soln[i]==1)
            {
                System.out.println(W[i]+" units of Object "+O[i]);
            }
            else if(soln[i]==0)
            {
                System.out.println("0 units of Object "+O[i]);
            }
            else
            {
                System.out.println((int)(soln[i] * W[i])+" units of Object "+O[i]);
            }
        }
    }
    
    public void display_qn(int O[], int P[], int W[])
    {
        System.out.println("Objects:");
        display(O);
        System.out.println("Profit:");
        display(P);
        System.out.println("Weight:");
        display(W);
    }
    
    public void display(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"  ");
        }
        System.out.println();
    }
    
    public void display(double a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"  ");
        }
        System.out.println();
    }
    
    public double max(double a[])
    {
        double max = a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
                this.c = i;
            }
        }
        return max;
    }
    
    public static void main()
    {
        int Object[] = {1,2,3,4,5,6,7};
        int profits[] = {10,5,15,7,6,18,3};
        int weights[] = {2,3,5,7,1,4,1};
        int n = 7;
        int maxCapacity = 15; // 15kg
        
        knapsack_problem ob = new knapsack_problem();
        ob.knapsack(Object, profits, weights,n,maxCapacity);
    }
}
