package DSA;

import java.util.*;




public class polynomial_ll
{
    private poly_node head;
    
    Scanner in = new Scanner(System.in);
    
    public void create()
    {
        poly_node t, last;
        int n, i;
        last = null;
        System.out.println("Enter no of terms");
        n = in.nextInt();
        System.out.println("Enter each term with coeff and exp");
        for(i=0;i<n;i++)
        {
            t = new poly_node();
            t.coeff = in.nextInt();
            t.exp = in.nextInt();
            t.next = null;
            
            if(head == null)
            {
                head = last = t;
            }
            else
            {
                last.next = t;
                last = t;
            }
        }
    }
    
    public void display()
    {
        poly_node p = head;
        while(p!=null)
        {
            System.out.print(p.coeff+"x^"+p.exp+" + ");
            p = p.next;
        }
        System.out.println();
    }
    
    public long eval(int x)
    {
        long res= 0;
        poly_node p = head;
        while(p!=null)
        {
            res += p.coeff * Math.pow(x,p.exp);
            p=p.next;
        }
        return res;
    }
    
    public static void main()
    {
        polynomial_ll p1 = new polynomial_ll();
        p1.create();
        p1.display();
    }
}
