package DSA;

import java.util.*;

public class double_hashing
{
    int HT[];
    int SIZE = 10;  
    int count;
    int R = 7;

    public double_hashing()
    {
        HT = new int[10];
        count = 0;
        for(int i=0;i<10;i++)
            HT[i] = 0;
    }

    public int getsize()
    { return SIZE;}

    public void disp_hash_func1()
    {
        System.out.println("h1(x) = x%SIZE");
    }
    
    public void disp_hash_func2()
    {
        System.out.println("h2(x) = R-X%R");
    }
    
    public void display_probed_func()
    {
        System.out.println("h'(x) = (h1(x) + i*h2(x))%SIZE");
    }

    public double loading_factor()
    {
        return (double)this.count/this.getsize();
    }

    int hash1(int k)
    {
        return k%SIZE;
    }
    
    int hash2(int k)
    {
        return R-(k%R);
    }
    
    int hash(int k)
    {
        return (hash1(k)+hash2(k))%SIZE;
    }
    
    public int probe(int k)
    {
        int index = hash(k);
        int i=0;
        while(HT[(hash1(k)+(i*hash2(k)))%SIZE]!=0)
        {
            i++;
        }
        return (hash1(k)+(i*hash2(k)))%SIZE;
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
            int index = hash1(key);
            if(HT[index] != 0)
            {
                index = probe(key);
            }
            HT[index] = key;
            this.count++;
        }
        else
        {
            System.out.println("You cannot enter the value "+ key+" inside the hash table");
        }
    }

    public int search(int k)
    {
        int index= hash(k);
        int i=0;
        while(HT[(hash1(k)+(i*hash2(k)))%SIZE] != k && HT[(hash1(k)+(i*hash2(k)))%SIZE] != 0)
        {
            i++;
        }
        if(HT[(hash1(k)+(i*hash2(k)))%SIZE]==k)
            return (hash1(k)+(i*hash2(k)))%SIZE;
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

    // we avoid deleting in linear probing hashing
}
