package DSA.Arrays_ADT;


import java.util.*;

public class multiple_missing_ele
{
    // find multiple missing elements in a sequence
    
    public void find_1(int a[])
    {
        System.out.println("missing elements are");
        int len = a.length;
        int l = a[0];
        int h = a[len-1];
        int diff = a[0]-0;
        for(int i=0;i<len;i++)
        {
            if(a[i]-i != diff)
            {
                while(diff<(a[i]-i))
                {
                    System.out.println(i+diff);
                    diff++;
                }
            }
        }
    }
    
    
    // another methos (hashing) unsroted array
    
    public int max(int a[])
    {
        int max = a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        return max;
    }
    
    public int min(int a[])
    {
        int min = a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min = a[i];
            }
        }
        return min;
    }
    
    public void find_2(int a[])
    {
        System.out.println("missing elements are");
        int len = a.length;
        int l = min(a);
        int h = max(a);
        int H[] = new int[h+1];
        
        for(int i=0;i<len;i++)
        {
            H[a[i]] = 1;
        }
        
        for(int i=0;i<H.length;i++)
        {
            if(H[i]==0 && i>=l)
                System.out.println(i);
        }
    }
    
    public static void main()
    {
        multiple_missing_ele ob = new multiple_missing_ele();
        
        int a[] = {6,7,8,9,11,12,15,16,17,18,19};
        ob.find_2(a);
    }
}
