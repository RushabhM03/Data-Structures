package DSA;

import java.util.*;

class Node
{
    char data;
    Node next;
}

public class Stack_LL  implements stack_interface_LL
{
    private Node TOP;
    
    // no param const bcoz LL has unlimited size;
    Stack_LL()
    {
        TOP = null;
    }
    
    public boolean isEmpty()
    {
        return (TOP == null);
    }
    
    public boolean isFull()
    {
        Node t = new Node();
        return t == null;
    }
    
    public char stackTop()
    {
        if(isEmpty())
            return '\u0000';
        else
        {
            return TOP.data;
        }
    }
    
    public int peek(int pos)
    {
        char x = '\u0000';
        Node p = TOP;
        for(int i =0;i<pos-1 && p!=null;i++)
        {
            p = p.next;
        }
        if(p!=null)
            x = p.data;
        return x;
    }
    
    public void display()
    {
        System.out.println("Stack is");
        Node p = TOP;
        while(p!=null)
        {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }
    
    public void push(char x)
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
    
    public char pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack underlow");
            return '\u0000';
        }
        else
        {
            char x = TOP.data;
            Node t = TOP;
            TOP = TOP.next;
            t.next = null;
            t = null;
            return x;
            
        }
    }
    
    public static void main()
    {
        /**
        Stack_LL s1 = new Stack_LL();
        System.out.println(s1.isEmpty());
        System.out.println(s1.isFull());
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.display();
        System.out.println(s1.pop());
        s1.display();
        System.out.println(s1.isEmpty());
        System.out.println(s1.isFull());
        System.out.println(s1.stackTop());*/
        
    }
}
