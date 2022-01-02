package DSA;

import java.util.*;

public class queue_array_generic <T>
{
    T a[];
    int size;
    int FRONT;
    int REAR;
    
    queue_array_generic()
    {
        this(16);
    }
    
    queue_array_generic(int size)
    {
        FRONT = -1;
        REAR = -1;
        this.size = size;
        a = (T[])new Object[size];
    }
    
    public boolean isEmpty()
    {
        return FRONT == REAR;
    }
    
    public boolean isFull()
    {
        return REAR == size-1;
    }
    
    public void display()
    {
        System.out.println("The Queue is");
        for(int i=FRONT+1;i<=REAR;i++)
        {
            System.out.print(((car)a[i]).name+"  ");
        }
        System.out.println();
    }
    
    public void enqueue(T x)
    {
        if(isFull())
        {
            System.out.println("Queue overflow");
            return;
        }
        a[++REAR] = x;
    }
    
    public T dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue underflow");
            return null;
        }
        return a[++FRONT];
        // Note: here no element is stored at the front index. elemenets are stored from the following index.
    }
    
    
}
