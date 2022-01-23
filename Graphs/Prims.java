package DSA;

import java.util.*;

public class Prims
{
    static int I = Integer.MAX_VALUE;

    int G[][];
    int n;
    int t[][];
    int near[];

    public Prims(int n)
    {
        this.n = n;
        G = new int[n][n];
        t = new int[2][n-1];
        near = new int[n];
        for(int i=0;i<n;i++)
            near[i] = I;
        for(int i=0;i<this.n;i++)
        {
            for(int j=0;j<this.n;j++)
            {
                G[i][j] = I;
            }
        }
    }

    public Prims(int A[][], int n)
    {
        this.n = n;
        G = new int[n][n];
        near = new int[n];
        for(int i=0;i<n;i++)
            near[i] = I;
        t = new int[2][n-2];
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

    public void displaycostmatrix()
    {
        for(int i=0;i<this.n;i++)
        {
            for(int j=0;j<this.n;j++)
            {
                System.out.print(G[i][j]+"              ");
            }
            System.out.println();
        }
    }

    public void display_tree()
    {
        for(int i=0;i<n-2;i++)
        {
            System.out.println("("+t[0][i]+" , "+t[1][i]+")");
        }
    }

    public void prims()
    {
        int i,j,k=0,u=0,v=0,min = I;
        int no = n-1;

        // find minimum cost edge
        // we assume all graphs start with initial edge as 1
        for(i=1;i<=no;i++)
        {
            for(j=i;j<=no;j++)
            {
                if(G[i][j]<min)
                {
                    min = G[i][j];
                    u=i;
                    v=j;
                }
            }
        }

        t[0][0] = u;
        t[1][0] = v;

        //update near
        near[u]=0;
        near[v]=0;

        for(i=1;i<=no;i++)
        {
            if(near[i]!=0)
            {
                if(G[i][u]<G[i][v])
                    near[i] = u;
                else
                    near[i] = v;
            }
        }

        // repeating procedure
        for(i=1;i<no-1;i++)
        {
            // find minimum from near array
            min = I;
            for(j=1;j<=no;j++)
            {
                if(near[j]!=0 && G[j][near[j]]<min){
                    min = G[j][near[j]];
                    k=j;
                }
            }
            t[0][i] = k;
            t[1][i] = near[k];
            near[k]=0;

            //update near[]
            for(j=1;j<=no;j++)
            {
                if(near[j]!=0 && G[j][k]<G[j][near[k]])
                {
                    near[j]=k;
                }
            }
        }
        for(i=0;i<no-1;i++)
        {
            System.out.println("("+t[0][i]+" , "+t[1][i]+")");
        }
    }

    public static void main()
    {
        int a[][] = {{I,I,I,I,I,I,I,I},
                {I,I,25,I,I,I,5,I},
                {I,25,I,12,I,I,I,10},
                {I,I,12,I,8,I,I,I},
                {I,I,I,8,I,16,I,14},
                {I,I,I,I,16,I,20,18},
                {I,5,I,I,I,20,I,I},
                {I,I,10,I,14,18,I,I}};
        Prims t = new Prims(a, 8);
        t.displaycostmatrix();
        t.prims();
    }
}
