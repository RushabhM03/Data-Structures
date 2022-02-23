package DSA;

import java.util.*;

/**
 * This is used to find the minimum cost path from source to destination in a multistage graph
 * Approach used: Dynamic programming
 * A multisatge graph is a directed weighted graph divided into stages
 * Here vertices start from 1.
 * method:forward
 */
public class multistage_graph
{
    int n;      // No of vertices
    int stages; // No of stages
    int cost[]; // array to store the cost of each vertex
    int C[][];  // adjacency matrix
    int d[];    // array to know via which vertex we are getting shortest path
    int path[]; // find the path
    
    int I = Integer.MAX_VALUE;
    
    public multistage_graph(int n, int stages, int c[][])
    {
        this.n = n;
        this.stages = stages;
        cost = new int[n+1];
        d = new int[n+1];
        path = new int[stages+1];
        this.C = new int[n+1][n+1];
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c.length;j++)
                this.C[i][j] = c[i][j];
        }
        
        //Always the cost of the last vertex will be 0
        cost[n] = 0;
        d[n] = n;
    }
    
    public void find()
    {
        // find the minium cost and update cost and d array
        for(int i=n-1;i>=1;i--)
        {
            int min = I;
            for(int k=i+1;k<=n;k++)
            {
                if(C[i][k]!=0 && C[i][k]+cost[k]<min)
                {
                    min = C[i][k]+cost[k];
                    d[i] = k;
                }
            }
            cost[i] = min;
        }
        
        // set the path array
        path[1] = 1;
        path[stages] = n;
        for(int i=2;i<stages;i++)
            path[i] = d[path[i-1]];
        
        display_res();
            
        System.out.println("Minimum cost = "+cost[1]);
    }
    
    public void display_res()
    {
        System.out.println("The adjacency matrix:");
        display(C);
        System.out.println("The cost matrix");
        display(cost);
        
        System.out.println("Optimal path");
        for(int i=1;i<=stages;i++)
        {
            System.out.print(path[i]+" ---> ");
        }
        System.out.println();
    }
    
    public void display(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"     ");
        }
        System.out.println();
    }
    
    public void display(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
           for(int j=0;j<a.length;j++)
           {
                System.out.print(a[i][j]+"     ");
           }
           System.out.println();
        }
        System.out.println();
    }
    
    public static void main()
    {
        int n=8;
        int s=4;
        int c[][] = {{0,0,0,0,0,0,0,0,0},
                     {0,0,2,1,3,0,0,0,0},
                     {0,0,0,0,0,2,3,0,0},
                     {0,0,0,0,0,6,7,0,0},
                     {0,0,0,0,0,6,8,4,0},
                     {0,0,0,0,0,0,0,0,6},
                     {0,0,0,0,0,0,0,0,4},
                     {0,0,0,0,0,0,0,0,5},
                     {0,0,0,0,0,0,0,0,0}};
        multistage_graph ob = new multistage_graph(n,s,c);
        ob.find();
    }
}
