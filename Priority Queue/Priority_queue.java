package DSA;

import java.util.*;
import java.lang.Math.*;

/**
 * A priority queue is a heap where insertion takes by creating a heap and 
 * deleteion takes place by deleting root from heap
 * 
 * Here higher the element number, higher is its priority
 */
public class Priority_queue
{
    int size;
    
    public Priority_queue()
    {
        size = 0;
    }
    
    public int getSize()
    {
        return this.size+1;
    }
    
    public boolean isEmpty()
    {
        return size==0;
    }
    
    public boolean isPresent(int a[], int t)
    {
        for(int i=1;i<a.length;i++)
        {
            if(a[i]==t)
                return true;
        }
        return false;
    }
    
    public int getPriority(int a[], int t)
    {
        if(isPresent(a,t))
            return t;
        return -1;
    }
    
    public double height()
    
    {
        double r = Math.log(this.getSize())/Math.log(2);
        return Math.ceil(r);
    }
    
    public void display(int a[])
    {
        System.out.println("Priority Queue is: ");
        for(int i=1;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
    public void insert(int a[], int n)
    {
        // n = index of recently stored element
        int i=n;
        int temp = a[n];
        
        while(i>1 && temp>a[i/2])
        {
            a[i] = a[i/2];
            i=i/2;
        }
        a[i] = temp;
        size++;
    }
    
    public void create(int a[])
    {
        int i;
        for(i=2;i<a.length;i++)
        {
            insert(a,i);
        }
    }
    
    public int delete(int a[], int n)
    {
        // n = length of array -1;
        int x,i,j;
        int d = a[1];
        x = a[n];
        a[1] = a[n];
        i=1;
        j=2*i;
        while(j<n-1)
        {
            if(a[j+1]>a[j])
                j = j+1;
            if(a[i]<a[j])
            {
                //swap
                int t = a[i];
                a[i]=a[j];
                a[j]=t;
                i = j;
                j = 2*j;
                
            }
            else
                break;
            
        }
        a[n] = d;
        this.size--;
        return d;
    }
    
    public int next(int a[])
    {
        if(!isEmpty())
            return a[1];
        return -1;
    }
}
