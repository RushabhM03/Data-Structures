package DSA;

import java.util.*;

/**
 * Write a description of class maxheap_test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class maxheap_test
{
    public static void main()
    {
        int a[] = {0,1,2,3,4,5};
        Max_Heap heap = new Max_Heap();
        heap.create(a);
        heap.display(a);
        System.out.println(heap.isEmpty());
        System.out.println(heap.getSize());
        System.out.println(heap.height());
        
        //System.out.println("Deleted value = "+ heap.delete(a,a.length-1));
        heap.heapsort(a,a.length-1);
        heap.display(a);
    }
}
