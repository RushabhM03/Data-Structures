package DSA;

import java.util.*;
import java.util.PriorityQueue;

/**
 * Approach: Greedy method
 * Optimal margeing pattern
 * We find the minimum time required to merge 2 out of n lists by selecting min
 * Optimization: minimum cost/ time
 * constraint: all lists should be merged
 */

public class Optimal_merge_pattern
{
    // L = array of lists
    // S = array of sizes of each list
    
    int MAX = Integer.MAX_VALUE;
    
    public void merge_pattern(String L[], int S[], int n)
    {
        // display initial data
        display_qn(L,S);
        
        // first thing is to sort the files according to increasing order of their sizes
        System.out.println("After sorting the arrays by their sizes in increasing order");
        sort(L,S,n);
        display_qn(L,S);
        
        int cost = 0;
        
        // this is Pq using min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // push into pq
        for(int i=0;i<n;i++)
        {
            pq.add(S[i]);
        }
        
        // repeating procedure
        while(pq.size()>=2)
        {
            // take the 2 smallest size files
            int temp_amt = pq.poll() + pq.poll();
            cost += temp_amt;
            pq.add(temp_amt);
        }
        
        System.out.println("Total minimum cost = "+ cost);
    }
    
    public void sort(String L[], int S[], int n)
    {    
        // sorting
        // method used: selection sort
        int i,j,min;
        for(i=0;i<n-1;i++)
        {
            min = i;
            for(j=i;j<n;j++)
            {
                if(S[j]<S[min])
                {
                    min = j;
                }
            }
            int t =S[min];
            S[min]=S[i];
            S[i] = t;
            
            String l = L[min];
            L[min] = L[i];
            L[i] = l;
        }
    }
    
    public void display_qn(String L[], int S[])
    {
        System.out.println("Lists:");
        display(L);
        System.out.println("Size:");
        display(S);
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
        String L[] = {"x1", "x2", "x3", "x4", "x5"};
        int S[] = {20,30,10,5,30};
        
        Optimal_merge_pattern ob = new Optimal_merge_pattern();
        ob.merge_pattern(L,S,5);
    }
}
