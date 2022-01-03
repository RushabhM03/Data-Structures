package DSA;

import java.util.*;

public class generic_queue_ll_test
{
    
    public static void main()
    {
        queue_LL_generic <String> q = new <String> queue_LL_generic();
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        
        q.enqueue("hello");
        q.enqueue("hi");
        q.enqueue("bye");
        q.enqueue("ok");
        
        q.display();
        System.out.println(q.count());
        System.out.println(q.dequeue());
        q.display();
        
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        
    }
}
