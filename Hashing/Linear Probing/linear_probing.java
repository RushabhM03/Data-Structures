package DSA;

import java.util.*;

public class linear_probing
{
    int HT[];
    int SIZE = 10;  
    int count;

    public linear_probing()
    {
        HT = new int[10];
        count = 0;
        for(int i=0;i<10;i++)
            HT[i] = 0;
    }

    public int getsize()
    { return SIZE;}

    public void disp_hash_finc()
    {
        System.out.println("h(x) = x%SIZE");
    }

    public void display_probed_func()
    {
        System.out.println("h'(x) = (h(x) + f(i))% SIZE");
        System.out.println("f(i) = i");
    }

    public double loading_factor()
    {
        return (double)this.count/this.getsize();
    }

    int hash(int k)
    {
        return k%SIZE;
    }

    public int probe(int k)
    {
        int index = hash(k);
        int i=0;
        while(HT[(index+i)%SIZE]!=0)
        {
            i++;
        }
        return (index+i)%SIZE;
    }

    public void insert(int key)
    {
        /*if(loading_factor()>0.5)
        {
        System.out.println("You cannot enter the value inside the hash table");
        return;
        }*/
        
        if((loading_factor() - 0.5)<0)
        {
            int index = hash(key);
            if(HT[index] != 0)
            {
                index = probe(key);
            }
            HT[index] = key;
            this.count++;
        }
        else
        {
            System.out.println("You cannot enter the value inside the hash table");
        }
    }

    public int search(int key)
    {
        int index= hash(key);
        int i=0;
        while(HT[(index+i)%SIZE] != key && HT[(index+i)%SIZE] != 0)
        {
            i++;
        }
        if(HT[(index+i)%SIZE]==key)
            return (index+i)%SIZE;
        return -1;
    }

    public void display()
    {
        System.out.println("Hash table is: ");
        for(int i=0;i<SIZE;i++)
        {
            System.out.println(i+"||--->    "+HT[i]);
        }
    }

    
}
