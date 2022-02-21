package DSA;

import java.util.*;

/**
 * This is a dynamic programming problem
 * I have used both the methods i.e memoization and tabulation methods
 */
public class dynamic_factorial
{
    public int tabulation(int n)
    {
        int F[] = new int[n+1];
        F[0] = 0;
        F[1] = 1;
        for(int i=2;i<=n;i++)
        {
            F[i] = F[i-2] + F[i-1];
        }
        return F[n];
    }
    
    public int memoization(int n)
    {
        int F[] = new int [n+1];
        for(int i=0;i<n+1;i++)
            F[i] = -1;
        
        if(n<=1)
        {
            F[n] = n;
            return F[n];
        }
        else
        {
            if(F[n-2] == -1)
                F[n-2] = memoization(n-2);
            if(F[n-1] == -1)
                F[n-1] = memoization(n-1);
            F[n] = F[n-2] + F[n-1];
            return F[n-2] + F[n-1];
        }
    }
    
    public static void main()
    {
        dynamic_factorial ob = new dynamic_factorial();
        System.out.println(ob.tabulation(5));
        System.out.println(ob.memoization(6));
    }
}
