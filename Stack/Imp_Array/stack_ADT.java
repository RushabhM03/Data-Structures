package DSA;

import java.util.*;

public class stack_ADT implements stack_interface
{    
    int TOP = -1;
    int size;
    int a[];

    // default constructor
    stack_ADT()
    {
        this(16);
    }

    // param const
    stack_ADT(int size)
    {
        a = new int[size];
        this.size = size;
    }

    public boolean isEmpty()
    {
        return (TOP == -1);
    }

    public boolean isFull()
    {
        return (TOP == size-1);
    }
    
    public int stackTop()
    {
        if(isEmpty())
            return -1;
        return a[TOP];
    }
    
    public int peek(int pos)
    {
        int x = -1;
        int index = TOP - pos + 1;
        if(index<0 || index> TOP)
        {
            System.out.println("Invalid position");
            return x;
        }
        else
            return a[index];
    }
    
    public void push(int x)
    {
        if(isFull())
        {
            System.out.println("STACK OVERFLOW ERROR");
            return;
        }
        else
        {
            TOP++; 
            a[TOP] = x;
        }
    }
    
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("STACK UNDERFLOW");
            return -1;
        }
        else
        {
            return a[TOP--];
        }
    }
    
    public void display()
    {
        System.out.println("Stack is: ");
        int i;
        System.out.println("---------------------------------------------------------------------------------------");
        for(i=TOP;i>=0;i--)
        {
            System.out.println(a[i]);
        }
        System.out.println("---------------------------------------------------------------------------------------");
    }
    
}
