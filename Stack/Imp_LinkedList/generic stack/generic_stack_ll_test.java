package DSA;


import java.util.*;
public class generic_stack_ll_test
{
    
    public static void main()
    {
        stack_LL_generic <String> s1 = new <String> stack_LL_generic();
        System.out.println(s1.isEmpty());
        System.out.println(s1.isFull());
        s1.push("hi");
        s1.push("hello");
        s1.push("bye");
        s1.push("ok");
        s1.display();
        System.out.println(s1.pop());
        s1.display();
        System.out.println(s1.isEmpty());
        System.out.println(s1.isFull());
        System.out.println(s1.stackTop());
    }
}
