package DSA;

import java.util.*;

public class queue_test
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        
        int s;
        System.out.println("Enter size");
        s = in.nextInt();
        
        Queue_ADT q1 = new Queue_ADT(s);
        
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.display();
        System.out.println(q1.dequeue());
        q1.display();
    }
}
