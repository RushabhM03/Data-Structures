package DSA;

import java.util.*;

public class doubly_ll implements dll_interface
{
    private Node_dll head;
    
    public doubly_ll()
    {
        head = null;
    }
    
    public doubly_ll(int a[], int n)
    {
        Node_dll t, last;
        int i;
        
        head = new Node_dll();
        head.data = a[0];
        head.prev = null;
        head.next = null;
        last = head;
        
        for(i=1;i<n;i++)
        {
            t = new Node_dll();
            t.data = a[i];
            t.next = last.next;
            t.prev = last;
            last.next = t;
            last = t;
        }
    }
    
    public int length()
    {
        int c=0;
        Node_dll p = head;
        while(p!=null)
        {
            c++;
            p = p.next;
        }
        return c;
    }
    
    public void display()
    {
        Node_dll p = head;
        while(p!=null)
        {
            System.out.print(p.data + " <--> ");
            p = p.next;
        }
        System.out.print("null");
        System.out.println();
    }
    
    public void insert(int pos, int x)
    {
        if(pos<0 || pos>length())
            return;
        Node_dll t;
        if(pos == 0)
        {
            t = new Node_dll();
            t.data = x;
            t.prev = null;
            t.next = head;
            head.prev = t;
            head = t;
        }
        else
        {
            t = new Node_dll();
            t.data = x;
            Node_dll p = head;
            for(int i=0;i<pos-1;i++)
                p = p.next;
            t.next = p.next;
            t.prev = p;
            if(p.next!=null)
                p.next.prev = t;
            p.next = t;
        }
    }
    
    public int delete(int pos)
    {
        if(pos<1 || pos>length())
            return -1;
        if(pos == 1)
        {
            Node_dll p = head;
            head = head.next;
            int x = p.data;
            p.next = null;
            p = null;
            if(head!=null)
                head.prev = null;
            return x;
        }
        else
        {
            Node_dll p = head;
            int i;
            for(i=0;i<pos-1;i++)
                p = p.next;
            // modify links
            p.prev.next = p.next;
            if(p.next!=null)
                p.next.prev = p.prev;
            int x = p.data;
            p.next = null;
            p.prev = null;
            p = null;
            return x;
        }
    }
    
    public void reverse()
    {
        Node_dll p = head;
        while(p!=null)
        {
            Node_dll temp = p.next;
            p.next = p.prev;
            p.prev = temp;
            p = p.prev;
            if(p!=null && p.next == null )
                head = p;
        }
    }
    
    
}
