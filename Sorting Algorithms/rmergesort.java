package DSA;

import java.util.*;

public class rmergesort
{
    public void mergesort(int a[], int l, int h)
    {
        if(l<h)
        {
            int mid = (l+h)/2;
            mergesort(a,l,mid);
            mergesort(a,mid+1,h);
            merge(a,l,mid,h);
        }
    }
    
    public void merge(int a[], int l, int mid, int h)
    {
        int i,j,k;
        i = l;
        k = l;
        j = mid+1;
        int []b = new int[100];
        while(i<=mid && j<=h)
        {
            if(a[i]<a[j])
            {
                b[k++] = a[i++];
            }
            else
            {
                b[k++] = a[j++];
            }
        }
        
        for(;i<=mid;i++)
        {
            b[k++] = a[i];
        }
        for(;j<=h;j++)
        {
            b[k++] = a[j];
        }
        
        for(i=l;i<=h;i++)
        {
            a[i] = b[i];
        }
    }
    
    public static void main()
    {
        int a[] = {3,5,2,1,667,2,542,53,13};
        
        rmergesort ob = new rmergesort();
        ob.mergesort(a,0,a.length-1);
        
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
