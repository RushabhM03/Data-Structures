package DSA;

import java.util.*;

public class knapsack01
{
    int p[];
    int wt[];
    int k[][];
    int n,m;
    
    public knapsack01(int n,int m, int p[], int wt[])
    {
        int i,j;
        this.m = m;
        this.n = n;
        this.p = new int[n+1];
        this.wt = new int[n+1];
        for(i=0;i<=n;i++)
        {
            this.p[i] = p[i];
            this.wt[i] = wt[i];
        }
        
        k = new int[n+1][m+1];
        
    }
    
    public int max(int a, int b)
    {
        return a<b?b:a;
    }
    
    public void knapsack()
    {
        int i,w;
        for(i=0;i<=n;i++)
        {
            for(w=0;w<=m;w++)
            {
                if(i==0 || w==0)
                {
                    k[i][w] = 0;
                }
                else if(wt[i]<=w)
                {
                    k[i][w] = max(p[i]+k[i-1][w-wt[i]], k[i-1][w]);
                }
                else
                {
                    k[i][w] = k[i-1][w];
                }
            }
        }
        System.out.println(k[n][m]);
    }
    
    public void display()
    {
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                System.out.print(k[i][j]+"   ");
            }
            System.out.println();
        }
    }
    
    public void result()
    {
        int i=n,j=m;
        while(i>0 && j>0)
        {
            if(k[i][j] == k[i-1][j])
            {
                
                i--;
            }
            else
            {
                System.out.println(i+" object is included");
                
                j=j-wt[i];
                i--;
            }
        }
    }
    
    public static void main()
    {
        int p[] = {0,1,2,5,6};
        int wt[] = {0,2,3,4,5};
        
        knapsack01 ob = new knapsack01(4,8,p,wt);
        
        
        ob.knapsack();
        ob.display();
        ob.result();
    }
}
