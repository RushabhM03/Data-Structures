package DSA.Arrays_ADT;

import java.util.*;

public class max_min_ez
{
    public void find(int a[])
    {
        int n = a.length;
        int min = a[0];
        int max = a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]<min)    
                min=a[i];
            else if(a[i]>max)
                max = a[i];
        }
        
        System.out.println(min);
        System.out.println(max);
    }
    
    public static void main()
    {
        int a[] = {5,8,3,9,6,2,10,7,-1,4};
        max_min_ez ob = new max_min_ez();
        ob.find(a);
    }
}
