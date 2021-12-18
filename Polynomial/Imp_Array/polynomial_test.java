package DSA;

import java.util.*;

/**
 * Write a description of class polynomial_test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class polynomial_test
{
    public static void main()
    {
        
        Scanner in = new Scanner(System.in);
        
        int x;
        System.out.println("Enter no of elements");
        x = in.nextInt();
        
        polynomial p1 = new polynomial(x);
        p1.read();
        p1.display();
        
        /*polynomial p2 = new polynomial(x);
        p2.read();
        p2.display();
        
        polynomial p3 = p1.add(p2);
        p3.display();*/
        
        System.out.println(p1.evaluate());
    }
}
