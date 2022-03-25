package DSA;

import java.util.*;

public class optimalBST
{
    int keys[];
    int p[];
    int q[];
    int n;

    int c[][];      // storing cost 
    int r[][];      // storing min k index
    int w[][];      

    public optimalBST(int n, int k[], int p[], int q[])
    {
        this.n = n;
        keys = new int[n+1];
        this.p = new int[n+1];
        this.q = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            keys[i] = k[i];
            this.p[i] = p[i];
            this.q[i] = q[i];
        }

        c = new int[n+1][n+1];
        r = new int[n+1][n+1];
        w = new int[n+1][n+1];

    }

    public void computeW()
    {
        for(int i=0;i<=n;i++)// difference
        {
            for(int j=0;j<=n;j++)
            {
                for(int k=j;k<=n;k++)
                {
                    if(k-j==i)
                    {
                        if(i==0)
                        {
                            w[j][k] = q[k];
                        }

                        else
                        {
                            w[j][k] = w[j][k-1] + p[k]+q[k];
                        }
                    }
                }
            }
        }

    }

    public double optimalCost()
    {
        for(int i=0;i<=n;i++)// difference
        {
            for(int j=0;j<=n;j++)
            {
                for(int k=j;k<=n;k++)
                {
                    if(k-j==i)
                    {
                        if(i==0)
                        {
                            c[j][k] = 0;
                            r[j][k] = 0;
                        }

                        else
                        {

                            int min = Integer.MAX_VALUE;
                            for(int t = j+1;t<=k;t++)
                            {
                                int o = c[j][t-1] + c[t][k] + w[j][k];
                                if(o<min)
                                {
                                    min = o;
                                    r[j][k] = t;
                                }
                            }
                            c[j][k] = min;
                        }
                    }
                }
            }
        }
        
        int total = sum(p) + sum(q);
        return (double)c[0][this.n]/total;
    }

    public void display(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"  ");
        }
        System.out.println();
    }

    public void display(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
    
    public int sum(int a[])
    {
        int s = 0;
        for(int i=0;i<a.length;i++)
        {
            s+=a[i];
        }
        return s;
    }
    
    public static void main()
    {
        int k[] = {0,10,20,30,40};
        int p[] = {0,3,3,1,1};
        int q[] = {2,3,1,1,1};

        optimalBST ob = new optimalBST(4,k,p,q);
        ob.computeW();
        ob.display(ob.w);
        System.out.println("Optimal cost = "+ob.optimalCost());
        ob.display(ob.c);
        ob.display(ob.r);

    }
}
