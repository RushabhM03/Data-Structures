package DSA;

import java.util.*;

public class fibo
{
    public static int fib(int n)
    {
        if(n<=1)
            return n;
        return fib(n-1) + fib(n-2);
    }
    
    public static int fib1(int n)
    {
        int t0=0,t1=1;
        int s=0;
        if(n<=1)
            return n;
        for(int i=2;i<=n;i++)
        {
            s = t0+t1;
            t0=t1;
            t1=s;
        }
        return s;
    }
    
    public static void main()
    {
        System.out.println(fib1(4));
    }
}
