package DSA;

import java.util.*;

class car{
    String name;
    int tyres;
    
    car(String name, int tyres)
    {
        this.name = name;
        this.tyres = tyres;
    }
}

/**
 * Write a description of class generic_queue_ar_test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class generic_queue_ar_test
{
    public static void main()
    {
        car c1 = new car("toyota", 4);
        car c2 = new car("subaru", 4);
        car c3 = new car("honda", 4);
        car c4 = new car("mustang", 6);
        
        
        queue_array_generic <car> q = new  <car> queue_array_generic();
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        q.enqueue(c1);
        q.enqueue(c2);
        q.enqueue(c3);
        q.enqueue(c4);
        q.display();
        System.out.println(q.dequeue());
        q.display();
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
    }
}
