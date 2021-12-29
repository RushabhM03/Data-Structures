package DSA;

import java.util.*;

public class sll <T>
{
    private ll_node head;
    
    public sll()
    {
        head = null;
    }
    
    public sll(T a[], int n)
    {
        ll_node last,t;
        int i=0;
        
        head = new ll_node();
        head.data = a[i];
        head.next = null;
        last = head;
        
        for(i=1;i<n;i++)
        {
            t = new ll_node();
            t.data = a[i];
            t.next = null;
            last.next = t;
            last = t;
        }
    }
    
    public int count()
    {
        int count = 0;
        ll_node t = head;
        while(t!=null)
        {
            count++;
            t = t.next;
        }
        return count;
    }
    
    public void display()
    {
        ll_node t = head;
        while(t!=null)
        {
            System.out.print(t.data + "-->");
            t = t.next;
        }
        System.out.println();
    }
    
    public void rec_display(ll_node t)
    {
        while(t!=null)
        {
            System.out.print(t.data = "-->");
            rec_display(t.next);
        }
        
    }
    
    public boolean search(T x)
    {
        ll_node t = head;
        while(t!=null)
        {
            if(t.data.equals(x))
            {
                return true;
            }
            t = t.next;
        }
        return false;
    }
    
    
    public void insert(int pos, T x)
    {
        ll_node t = new ll_node();
        ll_node p = head;
        t.data = x;
        if(pos<0 || pos>count())
        {
            return;
        }
        if(pos==0)
        {
            t.next = head;
            head = t;
        }
        else
        {
            for(int i=0;i<pos-1;i++)
            {
                p = p.next;
            }
            
            t.next = p.next;
            p.next = t;
        }
    }
    
    public T delete(int pos)
    {
        T x = null;
        if(pos<1 || pos>count())
            return null;
        if(pos==1)
        {
            ll_node p= head;
            head = head.next;
            x = (T)p.data;
            p.next = null;
        }
        else
        {
            ll_node p,q;
            p = head;
            q = null;
            for(int i=0;i<pos-1;i++)
            {
                q = p;
                p = p.next;
            }
            if(p!=null)
            {
                q.next = p.next;
                x = (T)p.data;
                p.next = null;
            }
        }
        return x;
    }
    
    public void reverse()
    {
        ll_node p,q,r;
        p = head;
        q=null;
        r=null;
        while(p!=null)
        {
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }
        head = q;
    }
    
    public void remove_dup()
    {
        ll_node p,q;
        p = head;
        q = head.next;
        while(q!=null)
        {
            if(p.data != q.data)
            {
                p = q;
                q = q.next;
            }
            else
            {
                p.next = q.next;
                q.next = null;
                q = p.next;
            }
        }
    }
    
    public void concat(sll l2)
    {
        ll_node p,q;
        p = head;
        q = l2.head;
        while(p.next!=null)
        {
            p = p.next;
        }
        p.next = q;
        q = null;
        
    }
    
    public boolean isEmpty()
    {
        return head == null;
    }
    
    
}
