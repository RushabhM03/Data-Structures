package DSA;

import java.util.*;

public class count_sort
{
    public int max(int A[], int n)
    {
        int max = A[0];
        for(int i=1;i<A.length;i++)
        {
            if(A[i]>max)
            {
                max = A[i];
            }
        }
        return max;
    }
    
    public void countsort(int A[], int n)
    {
        int max = max(A, n);
        int c[] = new int[max+1];
        
        for(int i=0;i<max+1;i++)
        {
            c[i] = 0;
        }
        
        for(int i=0;i<n;i++)
        {
            c[A[i]]++;
        }
        
        int i=0, j=0;
        while(i<max+1)
        {
            if(c[i]>0)
            {
                A[j++] = i;
                c[i] -- ;
            }
            else
            {
                i++;
            }
        }
    }
    
    public static void main()
    {
        count_sort ob = new count_sort();
        
        int a[] = {4,2,5,1,5,22,52,56,1,4,4};
        int n=11;
        
        ob.countsort(a,n);
        
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
