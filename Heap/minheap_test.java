package DSA;

import java.util.*;
/**
 * Write a description of class minheap_test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class minheap_test
{
    public static void main()
    {
        int a[] = {0,18,3,5,2,5,1};
        Min_Heap heap = new Min_Heap();
        heap.create(a);
        heap.display(a);
        System.out.println(heap.isEmpty());
        System.out.println(heap.getSize());
        System.out.println(heap.height());
        heap.heapsort(a,a.length-1);
        heap.display(a);
    }
}
