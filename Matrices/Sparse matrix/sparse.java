package DSA;

import java.util.*;

public class sparse
{
    int m,n,num;
    element ele[];

    public sparse(int m, int n, int num)
    {
        this.m = m;
        this.n = n;
        this.num = num;
        ele = new element[this.num];
    }

    public void read()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter elements");
        for(int i=0;i<num;i++)
        {
            ele[i] = new element();
            ele[i].r = in.nextInt();
            ele[i].c = in.nextInt();
            ele[i].x = in.nextInt();
        }
    }

    public void display()
    {
        int k=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(ele[k].r==i && ele[k].c==j)
                    System.out.print(ele[k++].x + " ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public sparse add(sparse s2)
    {
        int i,j,k;
        if(m!=s2.m || n!=s2.n)
            return null;
            
        sparse sum = new sparse(m,n,num+s2.num);
        
        for(int z=0;z<sum.num;z++)
            sum.ele[z] = new element();
        
        i=j=k=0;
        while(i<num && j<s2.num)
        {
            if(ele[i].r<s2.ele[j].r)
            {
                sum.ele[k++] = ele[i++]; 
            }
            else if(ele[i].r>s2.ele[j].r)
            {
                sum.ele[k++] = ele[j++];
            }
            else
            {
                if(ele[i].c<s2.ele[j].c)
                {
                    sum.ele[k++] = ele[i++]; 
                }
                else if(ele[i].c>s2.ele[j].c)
                {
                    sum.ele[k++] = ele[j++];
                }
                else
                {
                    sum.ele[k] = ele[i];
                    sum.ele[k++].x = ele[i++].x + ele[j++].x;
                }
            }
        }
        for(;i<num;i++)
            sum.ele[k++] = ele[i];
        for(;j<s2.num;j++)
            sum.ele[k++] = s2.ele[j];
        sum.num = k;
        return sum;
    }

    public static void main()
    {
        sparse s1 = new sparse(3,3,3);
        s1.read();
        s1.display();
        
        sparse s2 = new sparse(3,3,3);
        s2.read();
        s2.display();
        
        sparse s3 = s1.add(s2);
        s3.display();
    }
}
