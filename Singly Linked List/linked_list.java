package DSA;

import java.util.*;

public class linked_list implements linked_list_interface
{
    private Node_1 head;
    public linked_list()
    {
        head = null;
    }
    
    public linked_list(int a[], int n)
    {
        Node_1 last, t;
        int i = 0;
        
        head = new Node_1();
        head.data = a[0];
        head.next = null;
        last = head;
        
        for(i=1;i<n;i++)
        {
            t = new Node_1();
            t.data = a[i];
            t.next = null;
            last.next = t;
            last = t;
        }
    }
    
    public int length()
    {
        int length = 0;
        Node_1 t = head;
        while(t!=null)
        {
            length++;
            t = t.next;
        }
        return length;
    }
    
    public int sum()
    {
        int sum = 0;
        Node_1 t = head;
        while(t!=null)
        {
            sum += t.data;
            t = t.next;
        }
        return sum;
    }
    
    public int max()
    {
        int max = head.data;
        Node_1 t = head;
        while(t!=null)
        {
            if(t.data>max)
                max = t.data;
            t = t.next;
        }
        return max;
    }
    
    public boolean search(int k)
    {
        Node_1 t = head;
        while(t!=null)
        {
            if(t.data == k)
            {
                return true;
                
            }
            t=t.next;
        }
        return false;
    }
    
    public void insert(int pos, int x)
    {
        Node_1 t = new Node_1();
        Node_1 p = head;
        t.data = x;
        if(pos<0 || pos>length())
            return;
        if(pos == 0)
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
    
    public void insert_sort(int data)
    {
        Node_1 p,q,t;
        p = head;
        q=null;
        t = new Node_1();
        t.data = data;
        t.next = null;
        
        if(p==null)
            head = t;
        else
        {
            while(p!=null && p.data<data)
            {
                q=p;
                p=p.next;
            }
            if(p==head)
            {
                t.next = head;
                head = t;
            }
            else
            {
                t.next = q.next;
                q.next = t;
            }
        }
    }
    
    public int delete(int pos)
    {
        Node_1 p,q;
        int x = -1, i;
        if(pos<1 || pos>length())
            return -1;
        if(pos==1)
        {
            x = head.data;
            p = head;
            head = head.next;
            p.next = null;
        }
        else
        {
            p= head;
            q=null;
            for(i=0;i<pos-1;i++)
            {
                q = p;
                p = p.next;
            }
            if(p!=null)
            {
                q.next = p.next;
                x = p.data;
                p.next = null;
            }
        }
        
        return x;
    }
    
    public boolean isSorted()
    {
        Node_1 p = head;
        int x = -32768;
        while(p!=null)
        {
            if(p.data<x)
                return false;
            x = p.data;
            p = p.next;
            
        }
        return true;
    }
    
    
    public void remove_dup()
    {
        Node_1 p,q;
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
    
    public void reverse()
    {
        Node_1 p,q,r;
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
    
    public void display()
    {
        Node_1 temp = head;
        System.out.println("The linked list is");
        while(temp != null)
        {
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public void concat(linked_list l2)
    {
        Node_1 p,q;
        p = head;
        q = l2.head;
        while(p.next!=null)
        {
            p = p.next;
        }
        p.next = q;
        q = null;
        
    }
    
    public void merge(linked_list l2)
    {
        Node_1 p,q,last,t;
        t = null;
        p = head;
        q = l2.head;
        if(p.data<q.data)
        {
            t = p;
            last = p;
            p = p.next;
            t.next = null;
        }
        else
        {
            t = q;
            last = q;
            q = q.next;
            t.next = null;
        }
        while(p!=null && q!= null)
        {
            if(p.data<q.data)
            {
                last.next = p;
                last = p;
                p = p.next;
                last.next = null;
            }
            else
            {
                last.next = q;
                last = q;
                q = q.next;
                last.next = null;
            }
        }
        if(p!=null)
            last.next = p;
        if(q!=null)
            last.next = q;
        head = t;
    }
    
    public void rec_display(Node_1 t)
    {
        
        if(t!= null)
        {
            System.out.print(t.data+" --> ");
            rec_display(t.next);
        }
        
    }
    
    public static void main()
    {
        
        //linked_list l1 = new linked_list();
        int b[] = {15,25,35,45,55};
        linked_list l2 = new linked_list(b, 5);
        int a[] = {100,200,300};
        linked_list l1 = new linked_list(new int[] {10,20,30,40,50}, 5);
        l1.display();
        l2.display();
        //System.out.println(l1.length());
        //System.out.println(l1.sum());
        //System.out.println(l1.max());
        //System.out.println(l1.search(4));
        
        //l1.insert(0,9);
        //l1.insert(4,80);
        //l1.insert_sort(34);
        //l1.insert_sort(5);
        //l1.display();
        //l1.delete(2);
        //l1.delete(1);
        //l1.display();
        //System.out.println(l1.isSorted());
        //l1.remove_dup();
        l1.merge(l2);
        l1.display();
    }
}
