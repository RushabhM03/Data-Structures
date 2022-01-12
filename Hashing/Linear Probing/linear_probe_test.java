package DSA;

import java.util.*;
/**
 * Write a description of class linear_probe_test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class linear_probe_test
{
    public static void main()
    {
        linear_probing h = new linear_probing();

        h.insert(12);
        h.insert(25);
        h.insert(35);
        h.insert(36);
        h.insert(1);
        h.insert(99);
        h.display();
        System.out.println("key found at " +h.search(36));
        System.out.println("key found at " +h.search(16));
        System.out.println(h.loading_factor());
    }
}
