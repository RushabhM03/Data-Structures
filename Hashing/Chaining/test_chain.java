package DSA;

import java.util.*;
/**
 * Write a description of class test_chain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test_chain
{
    public static void main()
    {      
        hash_chaining h = new hash_chaining();
        h.insert(h.HT,12);
        h.insert(h.HT,22);
        h.insert(h.HT,42);
        System.out.println(h.HT[2].next.data);
        int index = h.hash(22);
        h.display();
        
        node_ht temp = h.ch.search(h.HT[h.hash(22)], 22);
        System.out.println(temp.data);
        
        System.out.println(h.ch.delete(h.HT,h.hash(22),22));
        h.display();
    }
}
