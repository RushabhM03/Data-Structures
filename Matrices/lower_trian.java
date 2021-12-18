package DSA;

import java.util.*;

public class lower_trian
{
    int n;
    int a[];
    
    lower_trian(int dim)
    {
        n = dim;
        a = new int[n*(n+1)/2];
    }
    
    public void set(int i, int j, int x)
    {
        if(i>=j && i>0)
        {
            a[(i*(i-1)/2)+ (j-1)]=x;
        }
    }
    
    public int get(int i, int j)
    {
        if (i>=j)
        {
            return a[(i*(i-1)/2)+ (j-1)];
        }
        return 0;
    }
    
    public void display()
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i>=j)
                    System.out.print(a[(i*(i-1)/2)+ (j-1)]+" ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
    
    public static void main()
    {
        lower_trian m1 = new lower_trian(2);
        
        m1.set(1,1,1);
        
        m1.set(2,1,3);
        m1.set(2,2,2);
        
        System.out.println(m1.get(2,2));
        System.out.println(m1.get(1,2));
        
        m1.display();
    }
    
    
}
