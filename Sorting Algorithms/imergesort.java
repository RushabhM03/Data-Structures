package DSA;

import java.util.*;

public class imergesort
{
    public void merge(int a[], int l, int mid, int h)
    {
        int i,j,k;
        i = l;
        j = mid+1; 
        k=l;
        int b[] = new int[100];
        while(i<=mid && j<=h)
        {
            if(a[i]<a[j])
                b[k++] = a[i++];
            else
                b[k++] = a[j++];
        }
        
        for(;i<=mid;i++)
            b[k++] = a[i];
        for(;j<=h;j++)
            b[k++] = a[j];
        
            
        for(i=l;i<=h;i++)
        {
            a[i] = b[i];
        }  
    }
    
    public void merge_sort(int a[], int n)
    {
        int p,i,l,h,mid;
        for(p=2;p<=n;p*=2)
        {
            for(i=0;i+p-1<n;i+=p)
            {
                l=i;
                h = i+p-1;
                mid = (l+h)/2;
                merge(a,l,mid,h);
            }
        }
        if(p/2<n)
            merge(a,0,p/2-1,n-1);
    }
    
    public static void main()
    {
        int a[] = {3,1,7,54,44,33,7,2,1};
        int n=9;
        imergesort ob = new imergesort();
        ob.merge_sort(a,n);
        
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
