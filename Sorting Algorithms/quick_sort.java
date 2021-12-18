package DSA;

import java.util.*;

public class quick_sort
{
    public int partition(int a[], int l, int h)
    {
        int pivot = a[l];
        int i=l,j=h;
        
        do
        {
            do
            {
                i++;
            }while(a[i]<=pivot);
            do
            {
                j--;
            }while(a[j]>pivot);
            if(i<j)
            {
                int t = a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }while(i<j);
        int t = a[j];
        a[j]=a[l];
        a[l]=t;
        return j;
    }
    
    public void quicksort(int a[], int l, int h)
    {
        int j;
        if(l<h)
        {
            j = partition(a,l,h);
            quicksort(a,l,j);
            quicksort(a,j+1,h);
        }
    }
    
    public static void main()
    {
        int a[] = {2,5,39,35,22,53,1,54,Integer.MAX_VALUE};
        
        quick_sort ob = new quick_sort();
        
        ob.quicksort(a,0,8);
       
        
        for(int i=0;i<8;i++)
        {
            System.out.println(a[i]);
        }
        
    }
}
