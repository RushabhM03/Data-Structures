package DSA.Arrays_ADT;

import java.util.*;

public class duplicates_s
{
    // find duplicates in a sorted array
    public void find_1(int a[])
    {
        int n = a.length;
        int lastDuplicate = 0;
        int count=0;
        for(int i =0;i<n-1;i++)
        {
            if(a[i] == a[i+1] && a[i]!=lastDuplicate)
            {
                int j = i+1;
                while(a[i] == a[j]){j++;}
                System.out.println(a[i]+" appears "+(j-i)+" times");
                lastDuplicate = a[i];
                count++;
            }
        }
        System.out.println("No of dups = "+count);
    }
    
    public void find_2(int a[])
    {
        int n = a.length;
        int l = a[0];
        int h = a[n-1];
        int H[] = new int[h+1];
        
        for(int i=0;i<n;i++)
        {
            H[a[i]]++;
        }
        
        for(int i=0;i<H.length;i++)
        {
            if(H[i]>1)
            {
                System.out.println(i+" appears "+H[i]+" times");
            }
        }
    }
    
    public static void main()
    {
        duplicates_s ob = new duplicates_s();
        int a[] = {3,6,8,8,10,12,15,15,15,20};
        ob.find_2(a);
    }
}
