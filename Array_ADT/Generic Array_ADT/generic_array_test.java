package DSA;

import java.util.*;
/**
 * Write a description of class generic_array_test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class generic_array_test
{
    public static void main()
    {
        array_pt <String> ob = new <String> array_pt();
        System.out.println(ob.isEmpty());
        System.out.println(ob.isFull());
        ob.append("hi");
        ob.append("hello");
        ob.append("bye");
        ob.insert(2,"sex");
        ob.display();
        System.out.println(ob.delete(2));
        System.out.println(ob.delete(9));
        ob.display();
        System.out.println(ob.linear_search("hi"));
        System.out.println(ob.linear_search("fvgs"));
        ob.set(1,"fuck");
        System.out.println(ob.get(2));
        ob.display();
        ob.reverse();
        ob.display();
        System.out.println(ob.isEmpty());
        System.out.println(ob.isFull());
        System.out.println(ob.getLength());
        ob.right_rotate();
        ob.display();
    }

    
}
