package DSA;

import java.util.*;

class Node
{
    int data;
    Node next;
}

public class queue_LL implements queue_interface
{
    Node front;
    Node rear;

    queue_LL()
    {
        front = null;
        rear = null;
    }

    public boolean isEmpty()
    {
        return front == null;
    }
    
    public boolean isFull()
    {
        Node t = new Node();
        if(t!=null)
            return true;
        return false;
    }
    
    public void display()
    {
        Node p = front;
        System.out.println("Queue is");
        while(p!=null)
        {
            System.out.print(p.data+" ");
            p = p.next;
        }
        System.out.println();
    }

    public void enqueue(int x)
    {
        Node t = new Node();
        if(t == null)
            System.out.println("Queue is full");
        else
        {
            t.data = x;
            t.next = null;
            if(front == null)
            {
                front = t;
                rear = t;
            }
            else
            {
                rear.next = t;
                rear = t;
            }
        }
    }
    
    public int dequeue()
    {
        int x = -1;
        Node p;
        if(front == null)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        else
        {
            p = front;
            front = front.next;
            x = p.data;
            p.next = null;
            p = null;
            return x;
        }
    }
    
    
}
