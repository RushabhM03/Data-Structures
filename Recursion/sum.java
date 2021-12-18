package DSA;

import java.util.*;

public class sum
{
    public static void main()
    {
        System.out.println(add(10));
    }
    
    public static int add(int n)
    {
        if(n<=1)
            return n;
        return n+add(n-1);
    }
}
