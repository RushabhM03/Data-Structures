package DSA;

import java.util.*;

/**
 * SELECTION SORT
 * reduces no of swaps than bubble
 */
public class selection_Sort
{
    public static void selectionSort(int a[])
    {
        int i,j,min;
        int n= a.length;
        for(i=0;i<n-1;i++)
        {
            min = i;
            for(j=i;j<n;j++)
            {
                if(a[j]<a[min])
                {
                    min = j;
                }
            }
            int t = a[min];
            a[min]=a[i];
            a[i] = t;
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
        int sample[] = {6,2,45,12,4,1,40};

        selectionSort(sample);
        print(sample);
    }
}
