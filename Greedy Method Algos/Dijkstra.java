package DSA;

import java.util.*;

/**
 * This is a program for finding shortest path bw vertices by dijkstras algorithm
 * This is based on greedy method
 */

public class Dijkstra
{
    int V;                          // no of vertices
    int I = Integer.MAX_VALUE;      // used to find min
    int G[][];                      // Storing the graph
    int distance[];                 // stores the min distances
    int included[];                 // tells us if the index is included or not
    
    public Dijkstra(int V, int Graph[][])
    {
        this.V = V;
        // Here we assume that graph has nodes starting from 0
        G = new int[V][V];
        
        for(int i=0;i<V;i++)
        {
            for(int j=0;j<V;j++)
            {
                this.G[i][j] = Graph[i][j];
            }
        }
        
        this.distance = new int[V];
        this.included = new int[V];
        
        for(int i=0;i<V;i++)
        {
            distance[i] = I;
        }
    }
    
    public int getV()
    {
        return this.V;
    }
    
    public void displayG()
    {
        System.out.println("The graph is");
        for(int i=0;i<this.V;i++)
        {
            for(int j=0;j<this.V;j++)
            {
                System.out.print(G[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
    public void display_res()
    {
        System.out.println("The shortest paths are:");
        System.out.println("Vertex \t\t\t Distance");
        for(int i=0;i<V;i++)
        {
            System.out.println(i+"\t\t\t"+distance[i]);
        }
    }
    
    public int find_min_index()
    {
        int min_index = -1;
        int min = I;
        for(int i=0;i<this.V;i++)
        {
            if(included[i] == 0 && distance[i]<min)
            {
                min = distance[i];
                min_index = i;
            }
        }
        return min_index;
    }
    
    public void relaxation(int u, int v)
    {
        if(distance[u]+G[u][v] < distance[v])
        {
            distance[v] = distance[u] + G[u][v];
        }
    }
    
    public void dijkstra(int source_index)
    {
        // set initial source distance to 0
        distance[source_index] = 0;
        
        for(int i=1;i<V;i++)
        {
           
            // pick min from distance
            int u = find_min_index();
            included[u] = 1;
            
            // update distance
            for(int j=0;j<V;j++)
            {
                if(included[j] == 0 && G[u][j] != 0 && distance[u]!=I)
                {
                    relaxation(u,j);
                }
            }
        }
        
        // display the result
        display_res();
    }
    
    public static void main()
    {
        int starting_vertex = 0;
        int G[][] = { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                      { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                      { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                      { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                      { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                      { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                      { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                      { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                      { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        int v = 9;
        Dijkstra ob = new Dijkstra(v,G);
        ob.dijkstra(starting_vertex);
    }
}
