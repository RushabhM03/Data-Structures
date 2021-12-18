package DSA;

import java.util.*;


public class fibo_memoization
{
    static int f[] = new int[10];
   public static int fib(int n)
   {    
       if(n<=1)
       {
           f[n] = n;
           return n;
       }
       else
       {
           if(f[n-2] == -1)
                f[n-2] = fib(n-2);
           if(f[n-1] == -1)
                f[n-1] = fib(n-1);
           f[n] = f[n-2] + f[n-1];
           return f[n-2]+f[n-1];
       }
   }
   public static void main()
   {
       for(int i=0;i<10;i++)
       {
           f[i] = -1;
       }
       
       System.out.println(fib(5));
    }
}
