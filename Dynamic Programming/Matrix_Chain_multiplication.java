package DSA;

import java.util.*;

/**
 * This is a program to find the most efficient order to multiply multiple matrices
 * This reduces the cost i.e. the number of multiplications performed
 * Approach: Dynamic programming
 */
public class Matrix_Chain_multiplication
{
    int no_of_matrices;     // No of matrices
    int n;                  // No of dimensions required
    int P[];                // store the dimensions
    int cost[][];           // cost matrix
    int km[][];             // To note through which value of k we get min cost
    
    public Matrix_Chain_multiplication(int no_of_matrices, int p[])
    {
        this.no_of_matrices = no_of_matrices;
        this.n = no_of_matrices+1;
        P = new int[n];
        for(int i=0;i<p.length;i++)
        {
            this.P[i] = p[i];
        }
        cost = new int[n][n];
        km = new int[n][n];
    }
    
    public void find()
    {
        int j, min, q;
        // outer d loop is for difference from 1 to n-2
        for(int d=1;d<n-1;d++)
        {
            for(int i=1;i<n-d;i++) // i for no of rows
            {
                // we will j get by adding i and differnce d
                j = i+d;
                min =  Integer.MAX_VALUE;
                
                // loop for finding minimum
                for(int k=i;k<=j-1;k++)
                {
                    q = cost[i][k] + cost[k+1][j] + P[i-1]*P[k]*P[j];
                    if(q<min)
                    {
                        min = q;
                        km[i][j] = k;
                    }
                }
                cost[i][j] = min;
            }
        }
        
        System.out.println("Minimum cost = "+ cost[1][n-1]);
    }
    
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int m;
        int p[];
        System.out.println("Enter the no of matrices");
        m = in.nextInt();
        p = new int[m+1];
        for(int i=0;i<=m;i++)
        {
            System.out.println("Enter dimension d"+i);
            p[i] = in.nextInt();
        }
        Matrix_Chain_multiplication ob = new Matrix_Chain_multiplication(m,p);
        ob.find();
    }
}
