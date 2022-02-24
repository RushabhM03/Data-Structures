package DSA;

import java.util.*;

/**
 * This is the implementation of the floyd warshall algorithm
 * Approach: Dynamic programming 
 */
public class Floyd_warshall
{
    int A[][];      // matrix for 
    int n;          // no of vertices
    
    static int I = Integer.MAX_VALUE;
    
    public Floyd_warshall(int n, int a[][])
    {
        this.n = n;
        A = new int[n+1][n+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                this.A[i][j] = a[i][j];
            }
        }
    }
    
    public void find()
    {
        System.out.println("Initial matrix A0: ");
        display();
        
        int i,j,k;
        
        for(k=1;k<=n;k++)
        {
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=n;j++)
                {
                    if(A[k][j]!=I && i!=k && j!=k)
                        A[i][j] = min(A[i][j], (A[i][k]+A[k][j]));
                }
            }
            // display
            System.out.println("Pass no: "+ k);
            display();
        }
    }
    
    public int min(int a, int b)
    {
        return ((a>b)?b:a);
    }
    
    public void display()
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(A[i][j]+"  ");
            }
            System.out.println();
        }
    }
    
    public static void main()
    {
        int n = 4;
        int a[][] = {{0,0,0,0,0},
                     {0,0,3,I,7},
                     {0,8,0,2,I},
                     {0,5,I,0,1},
                     {0,2,I,I,0}};
        Floyd_warshall ob = new Floyd_warshall(n,a);
        ob.find();
    }
}
