package DSA;

import java.util.*;

public class dllist <T>
{
    private dll_node head;
    
    public dllist()
    {
        head = null;
    }
    
    public dllist(T a[], int n)
    {
        dll_node t, last;
        
        head = new dll_node();
        head.data = a[0];
        head.prev = head.next = null;
        last = head;
        
        for(int i=1;i<n;i++)
        {
            t = new dll_node();
            t.data = a[i];
            t.next = last.next;
            t.prev = last;
            last.next = t;
            last = t;
        }
    }
    
    public int length()
    {
        int c = 0;
        dll_node p = head;
        while(p!=null)
        {
            c++;
            p = p.next;
        }
        return c;
    }
    
    public void display()
    {
        dll_node p =head;
        while(p!=null)
        {
            System.out.print(p.data + "<-->");
            p = p.next;
        }
        System.out.println();
    }
    
    public void rec_display(dll_node p)
    {
        while(p!=null)
        {
            System.out.print(p.data + "<-->");
            rec_display(p.next);
        }
    }
    
    public void insert(int pos, T x)
    {
        if(pos<0 || pos>length())
            return;
        dll_node t;
        if(pos == 0)
        {
            t = new dll_node();
            t.data = x;
            t.next = head;
            t.prev = null;
            head.prev = t;
            head = t;
        }
        else
        {
            t = new dll_node();
            t.data = x;
            dll_node p = head;
            
            for(int i=0;i<pos-1;i++)
            {
                p = p.next;
            }
            t.next = p.next;
            
            t.prev = p;
            
            if(p.next!=null)
                p.next.prev = t;
            p.next = t;
        }
    }
    
    public T delete(int pos)
    {
        if(pos<0 || pos>length())
            return null;
        T x;
        if(pos == 1)
        {
            dll_node p = head;
            x = (T)p.data;
            head = head.next;
            p.next = null;
            p = null;
            if(head!=null)
                head.prev = null;
            return x;
        }
        
        else
        {
            dll_node p = head;
            int i;
            for(i=0;i<pos-1;i++)
                p = p.next;
            p.prev.next = p.next;
            if(p.next!=null)
                p.next.prev = p.prev;
            x = (T)p.data;
            p.next = null;
            p.prev = null;
            p = null;
            return x;
        }
    }
    
    public boolean isEmpty()
    {
        return head == null;
    }
    
    public void reverse()
    {
        dll_node p = head;
        while(p!=null)
        {
            dll_node temp = p.next;
            p.next = p.prev;
            p.prev = temp;
            p = p.prev;
            if(p!=null && p.next == null )
                head = p;
        }
    }
    
    
}
