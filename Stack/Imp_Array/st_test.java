package DSA;

import java.util.*;

public class st_test
{
    
    public static void main()
    {
        Scanner in = new Scanner(System.in);

        int s;
        System.out.println("Enter size of stack");
        s = in.nextInt();
        stack_ADT s1 = new stack_ADT(s);
        
        System.out.println(s1.isEmpty());
        System.out.println(s1.isFull());
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
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
