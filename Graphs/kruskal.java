package DSA;

import java.util.*;

public class kruskal
{
    static int I = Integer.MAX_VALUE;
    
    int e;// no of edges
    int n;// no of vertices
    int t[][];
    int edges[][];
    int included[];
    int set[];
    
    public kruskal(int n, int e)
    {
        this.n = n;
        this.e = e;
        set = new int[n+1];
        for(int i=0;i<set.length;i++)
            set[i] = -1;
        t = new int[2][n-1];
        included = new int[e];
        edges = new int[3][e];
    }
    
    public kruskal(int ed[][], int n, int e)
    {
        this.n = n;
        this.e = e;
        set = new int[n+1];
        for(int i=0;i<set.length;i++)
            set[i] = -1;
        t = new int[2][n-1];
        included = new int[e];
        edges = new int[3][e];
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<e;j++)
            {
                edges[i][j] = ed[i][j];
            }
        }
    }
    
    public void union(int u, int v)
    {
        if(set[u]<set[v])
        {
            set[u]+=set[v];
            set[v] = u;
        }
        else
        {
            set[v]+=set[u];
            set[u] = v;
        }
    }
    
    public int find(int u)
    {
        int x =u,v=0;
        while(set[x]>0)
        {
            x=set[x];
        }
        while(u!=x)
        {
            v=set[u];
            set[u]=x;
            u=v;
        }
        return x;
    }
    
    public void displaytree_kr()
    {
        for(int i=0;i<n-1;i++)
        {
            System.out.println("("+t[0][i]+","+t[1][i]+")");
        }
    }
    
    public void displaygraph()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<e;j++)
            {
                System.out.print(edges[i][j]+"  ");
            }
            System.out.println();
        }
    }
    
    public int getnVertices()
    {
        return this.n;
    }
    
    public int getnEdges()
    {
        return this.e;
    }
    
    public void kruskal()
    {
        int i,j,k=0,u=0,v=0,min=I;
        i=0;
        while(i<n-1)
        {
            // find min
            min= I;
            for(j=0;j<e;j++)
            {
                if(included[j]==0 && edges[2][j]<min)
                {
                    min=edges[2][j];
                    k=j;
                    u=edges[0][j];
                    v=edges[1][j];
                }
            }
            
            if(find(u)!=find(v))
            {
                t[0][i] = u;
                t[1][i] = v;
                union(find(u), find(v));
                i++;
            }
            included[k] = 1;
        }
    }
    
    public static void main()
    {
        int e[][] = {{1,1,2,2,3,4,4,5,5},
                     {2,6,3,7,4,5,7,6,7},
                     {25,5,12,10,8,16,14,20,18}};
                     
        kruskal k = new kruskal(e,7,9);
        k.kruskal();
        k.displaytree_kr();
    }
}
