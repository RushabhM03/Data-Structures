package DSA;

import java.util.*;

public class graph
{
    int G[][];
    int n;
    static int visited[];

    public graph(int n)
    {
        this.n = n;
        G = new int[n][n];
        visited = new int[n];
        for(int i=0;i<this.n;i++)
        {
            for(int j=0;j<this.n;j++)
            {
                G[i][j] = 0;
            }
        }
    }

    public graph(int A[][], int n)
    {
        this.n = n;
        G = new int[n][n];
        visited = new int[n];
        for(int i=0;i<this.n;i++)
        {
            for(int j=0;j<this.n;j++)
            {
                G[i][j] = A[i][j];
            }
        }
    }

    public int getN()
    {
        return  n;
    }

    public void displayADJmatrix()
    {
        for(int i=0;i<this.n;i++)
        {
            for(int j=0;j<this.n;j++)
            {
                System.out.print(G[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public void BFS(int start)
    {
        int i = start;
        Queue_ADT q = new Queue_ADT();

        //int visited[] = new int[n];
        System.out.print(i+" ");
        visited[i] = 1;

        q.enqueue(i);

        while(!q.isEmpty())
        {
            i = q.dequeue();
            for(int j=1;j<n;j++)
            {
                if(G[i][j] ==1 && visited[j]==0)
                {
                    System.out.print(j+" ");
                    visited[j]=1;
                    q.enqueue(j);
                }
            }
        }
        System.out.println();
    }

    public void DFS(int start)
    { 
        
        if(visited[start]==0)
        {
            System.out.print(start+" ");
            visited[start] = 1;
            for(int j=1;j<n;j++)
            {
                if(G[start][j]==1 && visited[j]==0)
                {
                    DFS(j);
                }
            }
        }
        
        
        
        /*stack_ADT s = new stack_ADT();
        int visited[] = new int [n];
        
        for (int i = 0; i < n; i++) 
	{
	    visited[i] = 0;
	}
	s.push(start);
	visited[start] = 1;
	while(!s.isEmpty())
	{
	    int x = s.pop();
	    System.out.print(x+" ");
	    for(int i=1;i<n;i++)
	    {
	        if(G[x][i]==1 && visited[i]==0)
	        {
	            s.push(i);
	            visited[i]=1;
	        }
	    }
	}
	System.out.println();*/
    }

    public static void main()
    {
        int G[][] = {{0,0,0,0,0,0,0},
                {0,0,1,1,0,0,0},
                {0,1,0,0,1,0,0},
                {0,1,0,0,1,0,0},
                {0,0,1,1,0,1,1},
                {0,0,0,0,1,0,0},
                {0,0,0,0,1,0,0}};

        graph g = new graph(G, 7);
        g.DFS(1);
        System.out.println();
        g.displayADJmatrix();
    }
}
