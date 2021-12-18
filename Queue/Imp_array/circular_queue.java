package DSA;

import java.util.*;

public class circular_queue implements queue_interface
{
    int q[];
    int FRONT;
    int REAR;
    int size;
    
    public circular_queue()
    {
        this(16);
    }
    
    public circular_queue(int s)
    {
        q = new int[s];
        size = s;
        FRONT = -1;
        REAR = -1;
    }
    
    public boolean isEmpty()
    {
        return REAR == FRONT;
    }
    
    public boolean isFull()
    {
        return ((REAR+1)%size==FRONT);
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
            REAR = (REAR+1)%size;
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
            FRONT = (FRONT+1)%size;
            x = q[FRONT];
            
        }
        
        return x;
    }
    
    public void display()
    {
        int i=FRONT+1;
        do
        {
            System.out.print(q[i]+" ");
            i = (i+1)%size;
        }while(i!=(REAR+1)%size);
        System.out.println();
    }
    
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        
        int s;
        System.out.println("Enter size");
        s = in.nextInt();
        
        //Queue_ADT q1 = new Queue_ADT(s);
        circular_queue q1 = new circular_queue(s);
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.display();
        System.out.println(q1.dequeue());
        q1.enqueue(56);
        q1.display();
    }
}
