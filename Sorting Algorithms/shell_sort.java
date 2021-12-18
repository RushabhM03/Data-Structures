package DSA;

import java.util.*;


public class shell_sort
{
    public void shell(int a[],int n)
    {
        int gap, i,j,temp;
        for(gap=n/2;gap>=1;gap/=2)
        {
            for(i=gap;i<n;i++)
            {
                temp = a[i];
                j = i-gap;
                while(j>=0 && a[j]>temp)
                {
                    a[j+gap] = a[j];
                    j=j-gap;
                }
                a[j+gap] = temp;
            }
        }
    }
    
    public static void main()
    {
        shell_sort ob = new shell_sort();
        int a[] = {4,2,6,1,65,5,2,5,2,68,12};
        int n=11;
        ob.shell(a,n);
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
