package DSA;

import java.util.*;
import java.lang.Math.*;

public class Min_Heap
{
    // array representation
    int size;   //NO of elements
    
    public Min_Heap()
    {
        size = 0;
    }
    
    public boolean isEmpty()
    {
        return size==0;
    }
    
    public int getSize()
    {
        return this.size+1;
    }
    
    public double height()
    {
        double r = (Math.log(size) / Math.log(2));
        return Math.ceil(r);
    }
    
    public void create(int a[])
    {
        int i;
        
        for(i=2;i<=a.length-1;i++)
        {
            insert(a, i);
        }
    }
    
    public void insert(int a[], int n)
    {
        int i=n, temp;
        temp = a[i];
        while(i>1 && temp<a[i/2])
        {
            a[i] = a[i/2];
            i=i/2;
        }
        a[i] = temp;
        size++;
    }
    
    public void display(int a[])
    {
        for(int i=1;i<a.length;i++)
        {
            System.out.print(a[i]+"  ");
        }
        System.out.println();
    }
    
    public int delete(int A[], int n)
    {
        int x,i,j,val;
        val = A[1];
        x = A[n];
        A[1] = A[n];
        i = 1;
        j=2*i;
        while(j<n-1)
        {
            if(A[j+1]<A[j])// find which child is bigger
            {
                j = j+1;
            }
            if(A[i]>A[j])
            {
                //swao
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                
                i=j;
                j=2*j;  // move j to left child
            }
            else
                break;
        }
        A[n] = val;
        return val;
    }
    
    public void heapsort(int a[], int n)
    {
        for(int i=n;i>1;i--)
            delete(a,i);
    }
}
