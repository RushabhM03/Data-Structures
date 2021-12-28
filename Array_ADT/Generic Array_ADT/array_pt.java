package DSA;

import java.util.*;

public class array_pt<T>
{
    T a[];
    int size;
    int length;
    
    public array_pt()
    {
        this(16);
    }
    
    public array_pt(int s)
    {
        this.size = s;
        this.length = 0;
        a = (T[]) new Object[s];
    }
    
    public boolean isEmpty()
    {
        return length==0;
    }
    
    public boolean isFull()
    {
        return length==size;
    }
    
    public void display()
    {
        int i;
        System.out.println("Array ADT is");
        for(i=0;i<length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
    public int getLength()
    {
        return length;
    }
    
    public int getCapacity()
    {
        return size;
    }
    
    public void append(T x)
    {
        if(length<size)
        {
            a[length++] = x;   
        }
    }
    
    public void insert(int position, T x)
    {
        if(position>=0 && position<length)
        {
            for(int i=length;i>position;i--)
            {
                a[i] = a[i-1];
            }
            a[position] = x;
            length++;
        }
    }
    
    public T delete(int position)
    {
        T x = null;
        if(position>=0 && position<length)
        {
            x = a[position];
            for(int i=position;i<length-1;i++)
            {
                a[i] = a[i+1];
            }
            length--;
        }
        return x;
    }
    
    public boolean linear_search(T x)
    {
        for(int i=0;i<length;i++)
        {
            if(a[i].equals(x))
                return true;
            
        }
        return false;
    }
    
    // binary search wont be valid for generic type data
    
    public T get(int position)
    {
        if(position>=0 && position<length)
            return a[position];
        return null;
    }
    
    public void set(int position, T x)
    {
        if(position>=0 && position<length)
            a[position] = x;
    }
    
    public void reverse()
    {
        int i,j;
        for(i=0,j=length-1;i<j;i++,j--)
        {
            T temp;
            temp = a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
    
    public void left_rotate()
    {
        T x = a[0];
        for(int i=1;i<length;i++)
        {
            a[i-1] = a[i];
        }
        a[length-1] = x;
    }
    
    public void right_rotate()
    {
        T x = a[length-1];
        for(int i=length-2;i>=0;i--)
        {
            a[i+1] = a[i];
        }
        a[0] = x;
    }  
}
