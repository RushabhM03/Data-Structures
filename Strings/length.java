package DSA;

import java.util.*;

/**
 * Finding the length of a string (char array)
 */

public class length
{
    public int length(char ar[])
    {
        int i;
        for(i=0;ar[i]!='\u0000';i++)
        {
        }
        return i;
    }
    
    public static void main()
    {
        char name[] = {'s','t','r','i','n','g','\u0000'};
        length ob = new length();
        int l = ob.length(name);
        System.out.println("length = "+l);
    }
}
