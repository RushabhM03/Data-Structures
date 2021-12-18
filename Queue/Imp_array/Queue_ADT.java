package DSA;

import java.util.*;

public class Queue_ADT implements queue_interface
{
    int q[];
    int FRONT;
    int REAR;
    int size;
    
    public Queue_ADT()
    {
        this(16);
    }
    
    public Queue_ADT(int s)
    {
        q = new int[s];
        size = s;
        FRONT = -1;
        REAR = -1;
    }
    
    public boolean isEmpty()
    {
        return REAR==FRONT;
    }
    
    public boolean isFull()
    {
        return REAR==size-1;
    }
    
    public void enqueue(int x)
    {
        if(isFull())
        {
            System.out.println("queue is full");
            return;
        }
        else
        {
            REAR++;
            q[REAR] = x;
        }
    }
    
    public int dequeue()
    {
        int x = -1;
        
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return x;
        }
        else
        {
            FRONT++;
            x = q[FRONT];
            
        }
        
        return x;
    }
    
    public void display()
    {
        for(int i=FRONT+1; i<=REAR;i++)
        {
            System.out.print(q[i]+" ");
        }
        System.out.println();
    }
    
    
}
