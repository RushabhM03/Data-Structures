package DSA;

import java.util.*;

public class upper_trian
{
    int n;
    int a[];
    
    upper_trian(int dim)
    {
        n = dim;
        a = new int[n*(n+1)/2];
    }
    
    public void set(int i, int j, int x)
    {
        if(i<=j && i>0)
        {
            a[(j*(j-1)/2)+ (i-1)]=x;
        }
    }
    
    public int get(int i, int j)
    {
        if (i<=j)
        {
            return a[(j*(j-1)/2)+ (i-1)];
        }
        return 0;
    }
    
    public void display()
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i<=j)
                    System.out.print(a[(j*(j-1)/2)+ (i-1)]+" ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
    
    public static void main()
    {
        upper_trian m1 = new upper_trian(2);
        
        m1.set(1,1,1);
        
        m1.set(1,2,3);
        m1.set(2,2,2);
        
        System.out.println(m1.get(2,2));
        System.out.println(m1.get(1,2));
        
        m1.display();
    }
    
    
}
