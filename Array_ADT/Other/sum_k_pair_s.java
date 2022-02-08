package DSA.Arrays_ADT;


import java.util.*;
public class sum_k_pair_s
{
    public void find(int a[], int k)
    {
        int n = a.length;
        int i,j;
        i = 0;
        j = n-1;
        while(i<j)
        {
            if(a[i]+a[j] == k)
            {
                System.out.println(a[i++]+" + "+a[j--]+" = "+k);
            }
            else if(a[i]+a[j]<k)
            {
                i++;
            }
            else 
            {
                j--;
            }
        }
    }
    
    public static void main()
    {
        int a[] = {1,3,4,5,6,8,9,10,12,14};
        sum_k_pair_s ob = new sum_k_pair_s();
        ob.find(a,10);
    }
}
