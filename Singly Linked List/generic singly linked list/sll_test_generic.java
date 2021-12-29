package DSA;

import java.util.*;
/**
 * Write a description of class sll_test_generic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sll_test_generic
{
    public static void main()
    {
        String a[] = {"hello", "hi", "bye"};
        sll <String> l = new <String>sll(a,3);
        sll <String> l2 = new <String>sll(a,3);
        l.display();
        l.insert(1,"no");
        l.insert(3,"ok");
        //l.reverse();
        l.concat(l2);
        l.display();
        System.out.println(l.count());
    }
    
}
