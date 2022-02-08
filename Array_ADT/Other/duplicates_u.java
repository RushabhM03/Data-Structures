package DSA.Arrays_ADT;

import java.util.*;

public class duplicates_u
{
    public void find_1(int a[])
    {
        int count;
        int n = a.length;
        for(int i=0;i<n-1;i++)
        {
            count = 1;
            if(a[i]!=-1)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(a[i]==a[j])
                    {
                        count++;
                        a[j] = -1;
                    }
                }
                if(count>1)
                {
                    System.out.println(a[i]+" is present "+count+" times");
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
    
    public void find_2(int a[])
    {
        int n = a.length;
        int h = max(a);
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
        duplicates_u ob = new duplicates_u();
        int a[] = {8,3,6,4,6,5,6,8,2,7};
        ob.find_2(a);
    }
}
