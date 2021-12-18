package DSA;

import java.util.*;

public class dll_test
{
    public static void main()
    {
        int a[] = {2,4,6,8,10};
        doubly_ll l1 = new doubly_ll(a,5);
        System.out.println(l1.length());
        l1.display();
        l1.insert(0,7);
        l1.insert(6,11);
        l1.display();
        l1.delete(7);
        l1.delete(1);
        l1.delete(3);
        l1.display();
        l1.reverse();
        l1.display();
    }
}
