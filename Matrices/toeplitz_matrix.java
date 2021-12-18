package DSA;

import java.util.*;

public class toeplitz_matrix
{
    int n;
    int a[];
    
    toeplitz_matrix(int dim)
    {
        n = dim;
        a = new int[2*n-1];
    }
    
    public void set(int i, int j, int x)
    {
        if(i<=j && i>0)
        {
            a[j-i]=x;
        }
        else
        {
            a[n+i-j-1]=x;
        }
    }
    
    public int get(int i, int j)
    {
        if(i<=j && i>0)
        {
            return a[j-i];
        }
        else
        {
            return a[n+i-j-1];
        }
    }
    
    public void display()
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i<=j)
                    System.out.print(a[j-1]+"  ");
                else
                    System.out.print(a[n+i-j-1]+"  ");
            }
            System.out.println();
        }
    }
    
    public static void main()
    {
        toeplitz_matrix m1 = new toeplitz_matrix(5);
        
        m1.set(1,1,2);
        m1.set(1,2,3);
        m1.set(1,3,4);
        m1.set(1,4,5);
        m1.set(1,5,6);
        m1.set(2,1,7);
        m1.set(3,1,8);
        m1.set(4,1,9);
        m1.set(5,1,10);
        
        System.out.println(m1.get(2,2));
        System.out.println(m1.get(1,3));
        
        m1.display();
    }
    
    
}
