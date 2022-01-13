package DSA;

import java.util.*;
/**
 * Write a description of class double_hash_test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class double_hash_test
{
    public static void main()
    {
        double_hashing h = new double_hashing();
        h.insert(5);
        h.insert(25);
        h.insert(15);
        h.insert(35);
        h.insert(95);
        h.display();
    }
}
