package DSA;

import java.util.*;
/**
 * Write a description of class generic_dll_test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class generic_dll_test
{
    public static void main()
    {
        dllist <String> d = new <String> dllist(new String[]{"hi", "hello", "bye"}, 3);
        d.display();
        d.insert(3,"ok");
        d.display();
        d.delete(3);
        d.display();
    }
}
