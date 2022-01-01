package DSA;

import java.util.*;

class Node <T>
{
    T data;
    Node next;
}

public class stack_LL_generic <T>
{
    private Node TOP;
    
    stack_LL_generic()
    {
        TOP = null;
    }
    
    public boolean isEmpty()
    {
        return TOP == null;
    }
    
    public boolean isFull()
    {
        // ll becomes full when heap space runs out
        Node t = new Node();
        return t == null;
    }
    
    public T stackTop()
    {
        if(!isEmpty())
        {
            return (T)TOP.data;
        }
        return null;
    }
    
    public T peek(int pos)
    {
        Node p = TOP;
        for(int i =0;i<pos-1 && p!=null;i++)
        {
            p = p.next;
        }
        if(p!=null)
            return (T)p.data;
        return null;
    }
    
    public void display()
    {
        Node p = TOP;
        while(p!=null)
        {
            System.out.print(p.data + "  ");
            p = p.next;
        }
        System.out.println();
    }
    
    public void push(T x)
    {
        Node t = new Node();
        if(t == null)
        {
            System.out.println("Stack is full");
            return;
        }
        else
        {
            t.data = x;
            t.next = TOP;
            TOP = t;
        }
    }
    
    public T pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack underflow");
            return null;
        }
        else
        {
            T x = (T)TOP.data;
            Node p = TOP;
            TOP = TOP.next;
            p.next = null;
            return x;
        }
    }
    
}
