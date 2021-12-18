package DSA;

import java.util.*;

public class diagonal_matrix
{
    int n;
    int a[];
    
    diagonal_matrix(int dim)
    {
        n = dim;
        a = new int[n];
    }
    
    public void set(int i, int j, int x)
    {
        if(i==j && i>0)
        {
            a[i-1]=x;
        }
    }
    
    public int get(int i, int j)
    {
        if (i==j)
        {
            return a[i-1];
        }
        return 0;
    }
    
    public void display()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                    System.out.print(a[i]+" ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
    
    public static void main()
    {
        diagonal_matrix m1 = new diagonal_matrix(5);
        
        m1.set(1,1,1);
        m1.set(2,2,2);
        m1.set(3,3,3);
        m1.set(4,4,4);
        m1.set(5,5,5);
        
        System.out.println(m1.get(2,2));
        System.out.println(m1.get(1,3));
        
        m1.display();
    }
    
    
}
