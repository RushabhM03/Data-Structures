package DSA.Arrays_ADT;

import java.util.*;

public class missing_ele
{
    // Find a number that is missing from first n natural numbers
    public int find_1(int a[])
    {
        int len = a.length;
        int last = a[len-1];
        int sum_of_n = (last*(last+1))/2;
        int sum = 0;
        for(int i=0;i<len;i++)
        {
            sum += a[i];
        }
        int missing = sum_of_n - sum;
        return missing;
    }
    
    // find a number that is missing from a sequence of numbers(natural)
    // the sequence starts from any number
    public int find_2(int a[])
    {
        int len = a.length;
        int first = a[0];
        int last = a[len-1];
        int missing=-1;
        int diff = first-0;
        for(int i=0;i<len;i++)
        {
            if((a[i]-i)!=diff)
            {
                missing = i+diff;
                break;
            }
        }
        return missing;
    }
    
    public static void main()
    {
        int a[] = {1,2,3,4,5,6,8,9,10,11,12};
        missing_ele ob = new missing_ele();
        System.out.println(ob.find_1(a));
        
        int b[] = {6,7,8,9,10,11,13,14,15,16,17};
        System.out.println(ob.find_2(b));
    }
}
