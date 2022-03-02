package DSA;

import java.util.*;

/**
 * bellman ford algo
 * approach: dynamic progg
 */
public class bellman_ford
{
    int n;      // no of vertices
    int e;      // no of edges
    int cost[][];   // cost matrix
    int d[];       // distance matrix
    
    int I = Integer.MAX_VALUE;
    
    public bellman_ford(int n, int e, int c[][])
    {
        this.n = n;
        this.e = e;
        cost = new int[n+1][n+1];
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<n+1;j++)
            {
                this.cost[i][j] = c[i][j];
            }
        }
        
        d = new int[n+1];
        for(int i=0;i<n+1;i++)
        {
            d[i] = I;
        }
    }
    
    public void display_res()
    {
        System.out.println("Cost matrix");
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<n+1;j++)
            {
                System.out.print(cost[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("Distances: ");
        System.out.println("Vertex       Distance");
        for(int i=1;i<n+1;i++)
        {
            System.out.println(i+"        "+d[i]);
        }
        System.out.println();
    }
    
    public void bellmanFord(int starting)
    {
        d[starting] = 0;
        for(int i=1;i<n;i++)
        {
            // perform relaxation of each edge 
            for(int j=1;j<=n;j++)
            {
                for(int k=1;k<=n;k++)
                {
                    if(cost[j][k] != 0)
                        relaxation(j,k);
                }
            }
        }
        
        display_res();
    }
    
    public void relaxation(int u, int v)
    {
        if(d[u] + cost[u][v] < d[v])
        {
            d[v] = d[u] + cost[u][v];
        }
    }
    
    public static void main()
    {
        //            0,1,2,3,4,5,6,7
        int c[][] = {{0,0,0,0,0,0,0,0},
                     {0,0,6,5,5,0,0,0},
                     {0,0,0,0,0,-1,0,0},
                     {0,0,-2,0,0,1,0,0},
                     {0,0,0,-2,0,0,-1,0},
                     {0,0,0,0,0,0,0,3},
                     {0,0,0,0,0,0,0,3},
                     {0,0,0,0,0,0,0,0}};
        bellman_ford ob = new bellman_ford(7,10,c);
        ob.bellmanFord(1);
    }
}
