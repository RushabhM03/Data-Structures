package DSA;

import java.util.*;

public class towerofhanoi
{
    public static void toh(int n, int A, int B, int C)
    {
        if(n>0)
        {
            toh(n-1,A,C,B);
            System.out.println(A+" , "+C);
            toh(n-1,B,A,C);
        }
    }
    
    public static void main()
    {
        toh(4,1,2,3);
        
    }
}
