package DSA.q;

import java.util.*;

public class DEQUEUE_test
{
    public static void main()
    {
        DEQUE q = new DEQUE();
        
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        /**q.enqueue_REAR(10);
        q.enqueue_REAR(20);
        q.enqueue_REAR(30);
        q.enqueue_REAR(40);
        q.display();
        System.out.println(q.dequeue_FRONT());
        q.display();*/
        
        /**q.enqueue_REAR(10);
        q.enqueue_REAR(20);
        q.enqueue_REAR(30);
        q.enqueue_REAR(40);
        q.display();
        System.out.println(q.dequeue_REAR());
        q.display();*/
        
        q.enqueue_REAR(10);
        q.enqueue_REAR(20);
        q.enqueue_REAR(30);
        q.enqueue_REAR(40);
        q.display();
        System.out.println(q.dequeue_FRONT());
        q.display();
        q.enqueue_FRONT(100);
        q.display();
    }
}
