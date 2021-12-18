package DSA;

import java.util.*;

public class fact
{
    public static int facto(int n)
    {
        if(n==0)    
            return 1;
        return n*facto(n-1);
    }
    public static void main()
    {
        System.out.println(facto(5));
    }
}
