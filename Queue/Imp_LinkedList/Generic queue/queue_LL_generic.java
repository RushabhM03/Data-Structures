package DSA;

import java.util.*;

class node <T>
{
    T data;
    node next;
}

public class queue_LL_generic <T>
{
    node FRONT;
    node REAR;
    
    queue_LL_generic()
    {
        FRONT = REAR = null;
    }
    
    public boolean isEmpty()
    {
        return REAR == null;
    }
    
    public boolean isFull()
    {
        node t = new node();
        return t==null;
    }
    
    public void display()
    {
        node p = FRONT;
        System.out.println("Queue is");
        while(p!=null)
        {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }
    
    public int count()
    {
        node p = FRONT;
        int count = 0;
        while(p!=null)
        {
            count++;
            p = p.next;
        }
        return count;
    }
    
    public void enqueue(T x)
    {
        node t = new node();
        if(t == null)
            System.out.println("Queue overflow");
        else
        {
            t.data = x;
            t.next = null;
            if(FRONT == null)
            {
                FRONT = REAR = t;
            }
            else
            {
                REAR.next = t;
                REAR = t;
            }
        }
    }
    
    public T dequeue()
    {
        T x = null;
        if(FRONT == null)
        {
            System.out.println("Queue Underlow");
            return null;
        }
        else
        {
            node p = FRONT;
            x = (T)p.data;
            FRONT = FRONT.next;
            p.next = null;
            return x;
        }
    }
    
}
