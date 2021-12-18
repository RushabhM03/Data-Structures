package DSA;

import java.util.*;

public class queue_ll_test
{
    public static void main()
    {
        queue_LL q1 = new queue_LL();
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);
        q1.enqueue(60);
        q1.display();
        System.out.println(q1.dequeue());
        q1.display();
    }
}
