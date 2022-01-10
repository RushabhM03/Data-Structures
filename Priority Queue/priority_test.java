package DSA;

import java.util.*;
/**
 * Write a description of class priority_test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class priority_test
{
    
    public static void main()
    {
        // always insert a 0 at beginning of array
        Priority_queue pq = new Priority_queue();
        int [] a = {0,4,9,5,10,6,20,8,15,2,8};
        pq.create(a);
        pq.display(a);
        
        System.out.println(pq.delete(a,a.length-1));
        pq.display(a);
        System.out.println(pq.getPriority(a, 20));
        System.out.println(pq.getPriority(a, 90));
        
        System.out.println("Next in line = "+ pq.next(a));
        
    }
}
