package DSA;

import java.util.*;
/**
 * Write a description of class generic_pq_test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class generic_pq_test
{
    public static void main()
    {
        // always insert a 0 at beginning of array
        generic_PQ <String> pq = new <String> generic_PQ();
        
        PQ_node <String> n1 = new <String> PQ_node("Worker",1); 
        PQ_node <String> n2 = new <String> PQ_node("sales-man",2);   
        PQ_node <String> n3 = new <String> PQ_node("sales-man", 2);        
        PQ_node <String> n4 = new <String> PQ_node("Vice-president",4);       
        PQ_node <String> n5 = new <String> PQ_node("presidet",5);     
        PQ_node <String> n6 = new <String> PQ_node("ceo",6);
        
        PQ_node a[] = {null, n1,n2,n3,n4,n5};
        
        pq.create(a);
        pq.display(a);
        
        System.out.println(pq.delete(a,a.length-1));
        pq.display(a);
        System.out.println(pq.getPriority(a, n1));
        System.out.println(pq.getPriority(a, n6));
        
        System.out.println("Next in line = "+ pq.next(a));
        
    }
}
