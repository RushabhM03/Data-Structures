package DSA;

import java.util.*;
/**
 * Write a description of class generic_stackar_test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class generic_stackar_test
{
    
    public static void main()
    {
        Scanner in = new Scanner(System.in);

        int s;
        System.out.println("Enter size of stack");
        s = in.nextInt();
        stack_array_generic <String> s1 = new <String> stack_array_generic(s);
        
        System.out.println(s1.isEmpty());
        System.out.println(s1.isFull());
        s1.push("hello");
        s1.push("hi");
        s1.push("bye");
        s1.push("ok");
        s1.display();
        System.out.println(s1.pop());
        s1.display();
        System.out.println(s1.isEmpty());
        System.out.println(s1.isFull());
        System.out.println(s1.stackTop());
        System.out.println(s1.peek(2));
        System.out.println(s1.peek(9));
    }
}
