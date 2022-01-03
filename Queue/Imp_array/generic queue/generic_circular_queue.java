package DSA;

import java.util.*;

public class generic_circular_queue <T>
{
    T q[];
    int FRONT;
    int REAR;
    int size;
    
    public generic_circular_queue(int size)
    {
        this.size = size;
        FRONT = -1;
        REAR = -1;
        q = (T[]) new Object[size];
    }
    
    public generic_circular_queue()
    {
        this(16);
    }
    
    public boolean isEmpty()
    {
        return FRONT == REAR; 
    }
    
    public boolean isFull()
    {
        return FRONT == (REAR+1)%size; 
    }
    
    public int getSize()
    {
        return size;
    }
    
    public void display()
    {
        int i = FRONT+1;
        do
        {
            System.out.print(q[i]+ " ");
            i = (i+1)%size;
        }while(i != (REAR+1)%size);
        System.out.println();
    }
    
    public void enqueue(T x)
    {
        if(isFull())
        {
            System.out.println("Queue overflow");
            return;
        }
        REAR = (REAR+1)%size;
        q[REAR] = x;
    }
    
    public T dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue underflow");
            return null;
        }
        FRONT = (FRONT+1)%size;
        return q[FRONT];
    }
    
    public static void main()
    {
        generic_circular_queue <String> q1 = new <String> generic_circular_queue();
        q1.enqueue("hello");
        q1.enqueue("hi");
        q1.enqueue("bye");
        q1.enqueue("ok");
        q1.display();
        System.out.println(q1.dequeue());
        q1.enqueue("ssup");
        q1.display();
    }
}
