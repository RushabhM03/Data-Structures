package DSA.q;

import java.util.*;

public class DEQUE implements Deque_inter
{
    int q[];
    int FRONT;
    int REAR;
    int size;
    
    public DEQUE()
    {
        this(16);
    }
    
    public DEQUE(int s)
    {
        this.size = s;
        FRONT = REAR = -1;
        q = new int[this.size];
    }
    
    public boolean isEmpty()
    {
        return FRONT==REAR;
    }
    
    public boolean isFull()
    {
        return (REAR == this.size-1) && (FRONT == -1);
    }
    
    public void display()
    {
        for(int i=FRONT+1;i<=REAR;i++)
        {
            System.out.print(q[i]+"     ");
        }
        System.out.println();
    }
    
    public int getFRONT()
    {
        return q[FRONT+1];
    }
    
    public int getREAR()
    {
        return q[REAR];
    }
    
    public void enqueue_REAR(int x)
    {
        if(isFull())
        {
            System.out.println("Queue overflow");
            return;
        }
        else
        {
            REAR++;
            q[REAR] = x;
        }
    }
    
    public void enqueue_FRONT(int x)
    {
        if(isFull())
        {
            System.out.println("Queue overflow");
            return;
        }
        
        if(FRONT == -1)
        {
            System.out.println("Item cannot be inserted from FRONT");
            return;
        }
        
        q[FRONT] = x;
        FRONT--;
    }
    
    public int dequeue_FRONT()
    {
        int x = -1;
        if(isEmpty())
        {
            System.out.println("Queue underflow");
        }
        
        else
        {
            FRONT++;
            x = q[FRONT];
        }
        return x;
    }
    
    public int dequeue_REAR()
    {
        int x = -1;
        
        if(isEmpty())
        {
            System.out.println("Queue underflow");
        }
        
        else
        {
            x = q[REAR];
            REAR--;
        }
        
        return x;
    }
}
