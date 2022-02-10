package DSA;

import java.util.*;

public class rerverse
{
    public void reverse(char a[])
    {
        int n = a.length;
        char b[] = new char[n];
        int i,j;
        for(i=0;a[i]!='\u0000';i++)
        {
        }
        i=i-1;
        for(j=0;i>=0;i--,j++)
        {
            b[j] = a[i];
        }
        b[j] = '\u0000';
        for(i=0;i<n;i++)
        {
            a[i]=b[i];
        }
    }
    
    public static void main()
    {
        char name[] = {'s','T','r','I','n','G','\u0000'};
        rerverse ob = new rerverse();
        ob.reverse(name);
        for(int i=0;name[i]!='\u0000';i++)
            System.out.print(name[i]);
    }
}
