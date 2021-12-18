package DSA;

import java.util.*;

public class exp
{
    public static int pow(int m, int n)
    {
        if(n==0)
            return 1;
        if(n%2==0)
        {
            return pow(m*m , n/2);
        }
        else
        {
            return m * pow(m*m ,n/2);
        }
    }
    
    public static void main()
    {
        System.out.println(pow(2,5));
    }
}
