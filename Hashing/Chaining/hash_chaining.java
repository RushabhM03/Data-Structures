package DSA;

import java.util.*;

public class hash_chaining
{
    node_ht HT[] = new node_ht[10];
    chain ch = new chain();

    hash_chaining()
    {
        int i;
        for(i=0;i<10;i++)
            HT[i] = null;
    }

    public int hash(int key)
    {
        return key%10;
    }
    
    public void printhashfunc()
    {
        System.out.println("h(x) = x%10");
    }
    
    public void insert(node_ht []h, int key)
    {
        int index = hash(key);

        ch.insert_sort(h, index, key);
    }

    public void display()
    {
        System.out.println("Hash table is");
        for(int index=0;index<HT.length;index++)
        {
            
            node_ht h = HT[index];
            System.out.print(index+"|| ----> ");
            while(h!=null)
            {
                System.out.print(h.data + " --> ");
                h = h.next;
            }
            System.out.println("0 - end - 0");
        }
    }

    public static void main()
    {      
        hash_chaining h = new hash_chaining();
        h.insert(h.HT,12);
        h.insert(h.HT,22);
        h.insert(h.HT,42);
        System.out.println(h.HT[2].next.data);
        int index = h.hash(22);
        h.display();
    }
}
