package DSA;

import java.util.*;
import java.lang.Math.*;

/**
 * A priority queue is a heap where insertion takes by creating a heap and 
 * deleteion takes place by deleting root from heap
 * 
 * Here higher the element number, higher is its priority
 */
public class generic_PQ <T>
{
    int size;
    
    public generic_PQ()
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
    
    public boolean isPresent(PQ_node a[], PQ_node t)
    {
        for(int i=1;i<a.length;i++)
        {
            if((a[i]).position_name==t.position_name && (a[i]).priority==t.priority)
                return true;
        }
        return false;
    }
    
    public int getPriority(PQ_node a[], PQ_node t)
    {
        if(isPresent(a,t))
            return t.priority;
        return -1;
    }
    
    public double height()
    
    {
        double r = Math.log(this.getSize())/Math.log(2);
        return Math.ceil(r);
    }
    
    public void display(PQ_node a[])
    {
        System.out.println("Priority Queue is: ");
        for(int i=1;i<a.length;i++)
        {
            System.out.print(a[i].position_name+" ("+a[i].priority+")\t");
        }
        System.out.println();
    }
    
    public void insert(PQ_node a[], int n)
    {
        // n = index of recently stored element
        int i=n;
        PQ_node temp = new PQ_node();
        temp.position_name= a[n].position_name;
        temp.priority = a[n].priority;
        
        while(i>1 && temp.priority>a[i/2].priority)
        {
            a[i].position_name = a[i/2].position_name;
            a[i].priority = a[i/2].priority;
            i=i/2;
        }
        a[i].position_name = temp.position_name;
        a[i].priority = temp.priority;
        size++;
    }
    
    public void create(PQ_node a[])
    {
        int i;
        for(i=2;i<a.length;i++)
        {
            insert(a,i);
        }
    }
    
    public PQ_node delete(PQ_node a[], int n)
    {
        // n = length of array -1;
        int i,j;
        PQ_node d,x;
        d = new PQ_node();
        x = new PQ_node();
        d.position_name = a[1].position_name;
        d.priority = a[1].priority;
        
        x.position_name = a[n].position_name;
        x.priority = a[n].priority;
        
        a[1].position_name = a[n].position_name;
        a[1].priority = a[n].priority;
        
        i=1;
        j=2*i;
        
        while(j<n-1)
        {
            if(a[j+1].priority>a[j].priority)
                j = j+1;
            if(a[i].priority<a[j].priority)
            {
                //swap
                PQ_node t = new PQ_node();
                t.position_name = a[i].position_name;
                t.priority = a[i].priority;
                
                a[i].position_name=a[j].position_name;
                a[i].priority = a[j].priority;
                
                a[j].position_name=t.position_name;
                a[j].priority = t.priority;
                i = j;
                j = 2*j;
                
            }
            else
                break;
            
        }
        a[n].position_name = d.position_name;
        a[n].priority = d.priority;
        this.size--;
        return d;
    }
    
    public T next(PQ_node a[])
    {
        if(!isEmpty())
            return (T)a[1].position_name;
        return null;
    }
    
    
}
