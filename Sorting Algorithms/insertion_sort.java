package DSA;

import java.util.*;

/**
 * INSERTION SORT
 * slowest but simplest sorting method
 */
public class insertion_sort
{
    public static void insertionSort(int a[])
    {
        for(int i=1;i<a.length;i++)
        {
            int x = a[i];
            int j = i-1;
            while(j>=0 && a[j]>x)
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1]=x;
        }
    }
    
    public static void print(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    
    public static void main()
    {
        int sample[] = {6,2,45,12,4,1,45};
        
        insertionSort(sample);
        print(sample);
    }
}
