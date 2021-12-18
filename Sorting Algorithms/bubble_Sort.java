package DSA;

import java.util.*;

/**
 * BUBBLE SORT
 * slowest but simplest sorting method
 */
public class bubble_Sort
{
    public static void bubbleSort(int a[])
    {
        int flag = 0;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0)
            {
                break;
            }
        }
    }
    
    public static void print(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    
    public static void main()
    {
        int sample[] = {6,2,45,12,4,1,45};
        
        bubbleSort(sample);
        print(sample);
    }
}
