package DSA.Arrays_ADT;

import java.util.*;

public class sum_k_pair
{
    public void find(int a[], int sum)
    {
        int n = a.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]+a[j] == sum)
                {
                    System.out.println(a[i]+" + "+a[j]+" = "+sum); 
                }
            }
        }
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
    
    public void find_2(int a[], int sum)
    {
        int h = max(a);
        int n = a.length;
        
        int H[] = new int[h+1];
        for(int i=0;i<n;i++)
        {
            if(a[i]<=10 && H[sum-a[i]] != 0)
            {
                System.out.println(a[i]+" + "+(sum-a[i])+" = "+sum); 
            }
            H[a[i]]++;
        }
        
        
    }
    
    public static void main()
    {
        sum_k_pair ob = new sum_k_pair();
        int a[] = {6,3,8,10,16,7,5,2,4,14};
        ob.find_2(a,10);
    }
}
