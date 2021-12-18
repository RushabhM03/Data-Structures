package DSA;

import java.util.*;

public class Queue_node
{
    Tree_Node q[];
    int FRONT;
    int REAR;
    int size;
    
    public Queue_node()
    {
        this(16);
    }
    
    public Queue_node(int s)
    {
        q = new Tree_Node[s];
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
    
    public void enqueue(Tree_Node x)
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
    
    public Tree_Node dequeue()
    {
        Tree_Node x = null;
        
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