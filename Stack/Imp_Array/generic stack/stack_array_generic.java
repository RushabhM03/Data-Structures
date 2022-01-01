package DSA;

import java.util.*;

public class stack_array_generic <T>
{
    int size;
    int TOP = -1;
    T a[];
    
    stack_array_generic()
    {
        this(16);
    }
    
    stack_array_generic(int size)
    {
        this.size = size;
        a = (T[]) new Object[size];
    }
    
    public boolean isEmpty()
    {
        return TOP==-1;
    }
    
    public boolean isFull()
    {
        return TOP == size-1;
    }
    
    public T stackTop()
    {
        if(!isEmpty())
            return a[TOP];
        return null;
    }
    
    public T peek(int pos)
    {
        int index = TOP - pos + 1;
        if(index<0 || index>=TOP)
        {
            System.out.println("Invalid position");
            return null;
        }
        return a[index];
    }
    
    public void push(T x)
    {
        if(isFull())
        {
            System.out.println("Stack overflow error");
            return;
        }
        a[++TOP] = x;
    }
    
    
    public T pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack underflow error");
            return null;
        }
        return a[TOP--];
    }
    
    public void display()
    {
        System.out.println("The stack is");
        System.out.println("---------------------------------------------------------------------------------------");

        for(int i=TOP;i>=0;i--)
        {
            System.out.println(a[i]);
        }
        System.out.println("---------------------------------------------------------------------------------------");
    }
    
}
