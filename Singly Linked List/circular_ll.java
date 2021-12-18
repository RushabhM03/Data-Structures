package DSA;

import java.util.*;

public class circular_ll 
{
    private Node_1 head;
    public circular_ll()
    {
        head = null;
    }

    public void display()
    {
        Node_1 h = head;
        if(h == null)
            return;
        do
        {
            System.out.print(h.data+" --> ");
            h = h.next;
        }while(h!=head);
        System.out.println();
    }

    public circular_ll(int a[], int n)
    {
        Node_1 t, last;
        int i = 0;

        head = new Node_1();
        head.data = a[0];
        head.next = head;
        last = head;

        for(i=1;i<n;i++)
        {
            t = new Node_1();
            t.data = a[i];
            t.next = last.next;
            last.next = t;
            last = t;
        }
    }

    public int sum()
    {
        int sum = 0;
        Node_1 p = head;
        if(head == null)
            return sum;
        do
        {
            sum += p.data;
            p = p.next;
        }while(p!=head);
        return sum;
    }
    
    public int length()
    {
        int c = 0;
        Node_1 p = head;
        if(head == null)
            return 0;
        do
        {
            c++;
            p=p.next;
        }while(p!=head);
        return c;
    }

    public int max()
    {
        int max = head.data;
        Node_1 p =head;
        do
        {
            if(p.data>max)
                max = p.data;
            p = p.next;
        }while(p!=head);
        return max;
    }
    
    public int min()
    {
        int min = head.data;
        Node_1 p = head;
        do
        {
            if(p.data<min)
                min = p.data;
            p = p.next;
        }while(p!=head);
        return min;
    }
    
    public boolean search(int x)
    {
        Node_1 p = head;
        if(p == null)
            return false;
        do
        {
            if(p.data == x)
                return true;
            p = p.next;
        }while(p!=head);
        return false;
    }
    
    public void insert(int pos, int x)
    {
        Node_1 p,t;
        int i;
        if(pos<0 || pos>length())
            return;
        if(pos==0)
        {
            t = new Node_1();
            t.data = x;
            if(head==null)
            {
                head = t;
                head.next = head;
            }
            else
            {
                p = head;
                while(p.next != head)
                {
                    p = p.next;
                }
                p.next= t;
                t.next = head;
                head = t;
            }
        }
        else
        {
            p = head;
            for(i=0;i<pos-1;i++)
            {
                p = p.next;

            }
            t = new Node_1();
            t.data = x;

            t.next = p.next;
            p.next = t;
        }
    }

    public int delete(int pos)
    {
        Node_1 p,q;
        p = head;
        int x = -1;
        if(pos<1 || pos>length())
            return -1;
        if(pos == 1)
        {
            while(p.next != head)
            {
                p = p.next;
            }

            x = head.data;
            if(p==head)
            {
                head = null;
            }
            else
            {
                p.next = head.next;
                head.next = null;
                head = null;
                head = p.next;
            }
        }
        else
        {
            for(int i=0;i<pos-2;i++)
            {
                p = p.next;
            }
            q = p.next;
            x = q.data;
            p.next = q.next;
            q.next = null;
            q = null;
            return x;
        }
        return x;
    }

    public static void main()
    {
        int a[] = {1,2,3,4,5};
        circular_ll c1 = new circular_ll(a,5);
        c1.display();
        System.out.println(c1.sum());
        System.out.println(c1.max());
        System.out.println(c1.min());
        System.out.println(c1.search(3));

        System.out.println(c1.delete(3));
        c1.display();
    }
}
