package DSA;

import java.util.*;

public class Array_ADT implements Array_interface
{
    private int a[];
    private int length;
    private int size;

    public Array_ADT()
    {
        length = 0;
        size = 10;
        a = new int[size];
    }

    public Array_ADT(int s)
    {
        length = 0;
        size = s;
        a = new int[size];
    }
    
    public int getSize()
    {
        return size;
    }
    
    public int getLength()
    {
        return length;
    }
    
    public void display()
    {
        int i;
        System.out.println("The elements are");
        for(i=0;i<length;i++)
        {
            System.out.println(a[i]);
        }
    }

    public void append(int x)
    {
        if(length<size)
        {
            a[length] = x;
            length++;
        }
    }

    public void insert(int index, int x)
    {
        if(index>=0 && index<length)
        {
            int i;
            for(i=length;i>index;i--)
            {
                a[i] = a[i-1];
            }
            a[index] = x;
            length++;
        }
    }

    public int delete(int index)
    {
        int i, x=-1;
        if(index>=0 && index<length)
        {
            x = a[index];
            for(i=index;i<length-1;i++)
            {
                a[i] = a[i+1];
            }
            length--;
        }
        return x;
    }

    public int linear_search(int x)
    {
        for(int i=0;i<length;i++)
        {
            if(a[i] == x)
            {
                swap(a[i],a[0]);    // Move to head improvement
                return 0;
            }
        }
        return -1;
    }

    public void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }

    public int binsearch(int key)
    {
        int mid,l,h;
        l = 0;
        h = length-1;
        while(l<=h)
        {
            mid = (l+h)/2;
            if(key == a[mid])
                return mid;
            else if(key<a[mid])
                h = mid-1;
            else
                l = mid+1;

        }
        return -1;
    }

    public int recb_search(int l, int h, int key)
    {
        if(l<=h)
        {
            int mid = (l+h)/2;
            if(key == a[mid])
                return mid;
            else if(key<a[mid])
                return recb_search(l,mid-1,key);
            else
                return recb_search(mid+1,h,key);
        }
        return -1;
    }

    public int get(int index)
    {
        if(index>=0 && index<length)
            return a[index];
        return -1;
    }

    public void set(int index, int x)
    {
        if(index>=0 && index<length)
            a[index] = x;
    }

    public int max()
    {
        int max = a[0];
        for(int i=1;i<length;i++)
        {
            if(a[i]>max)
                max = a[i];
        }
        return max;
    }

    public int min()
    {
        int min = a[0];
        for(int i=1;i<length;i++)
        {
            if(a[i]<min)
                min = a[i];
        }
        return min;
    }

    public int sum()
    {
        int sum = 0;
        int i;
        for(i=0;i<length;i++)
            sum+=a[i];
        return sum;
    }

    public float avg()
    {
        return ((float)sum()/length);
    }

    public void reverse()
    {
        for(int i=0, j=length-1;i<j; i++,j--)
        {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
    }

    public void left_rotate()
    {
        int x = a[0];
        for(int i=1;i<length;i++)
        {
            a[i-1] = a[i];
        }
        a[length-1] = x;
    }

    public void right_rotate()
    {
        int x = a[length-1];
        for(int i=length-2;i>=0;i--)
        {
            a[i+1] = a[i];
        }
        a[0] = x;
    }

    public void insert_sorted(int x)
    {
        if(length<size)
        {
            int i= length-1;
            while(x<a[i] && i>=0)
            {
                a[i+1]=a[i];
                i--;
            }
            a[i+1]=x;
            length++;
        }
        else
        {
            System.out.println("Array size error");
        }
    }

    public boolean isSorted()
    {
        for(int i=0;i<length-1;i++)
        {
            if(a[i]>a[i+1])
                return false;
        }
        return true;
    }

    public void rearrange()
    {
        int i=0;
        int j = length-1;
        while(i<j)
        {
            while(a[i]<0){i++;}
            while(a[j]>=0){j--;}
            if(i<j){
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
    }
    
    public Array_ADT merge(Array_ADT b)
    {
        int i,j,k;
        i = j = k = 0;
        Array_ADT c = new Array_ADT(size + b.size);
        while(i<length && j<b.length)
        {
            if(a[i]<b.a[j])
                c.a[k++] = a[i++];
            else    
                c.a[k++] = b.a[j++];
        }
        for(;i<length;i++)
            c.a[k++] = a[i];
        for(;j<b.length;j++)
            c.a[k++] = b.a[j];
        //c.size = size + b.size;
        c.length = length + b.length;
        return c;
    }
    
    public Array_ADT union(Array_ADT b)
    {
        int i,j,k;
        i = j = k = 0;
        Array_ADT c = new Array_ADT(size + b.size);
        while(i<length && j<b.length)
        {
            if(a[i]<b.a[j])
                c.a[k++] = a[i++];
            else if(a[i] > b.a[j])   
                c.a[k++] = b.a[j++];
            else
            {
                c.a[k++] = a[i++];
                j++;
            }
        }
        for(;i<length;i++)
            c.a[k++] = a[i];
        for(;j<b.length;j++)
            c.a[k++] = b.a[j];
        //c.size = size + b.size;
        c.length = k;
        return c;
    }
    
    public Array_ADT intersection(Array_ADT b)
    {
        int i,j,k;
        i = j = k = 0;
        Array_ADT c = new Array_ADT(size + b.size);
        while(i<length && j<b.length)
        {
            if(a[i]<b.a[j])
                i++;
            else if(a[i]>b.a[j])   
                j++;
            else
            {
                c.a[k++] = a[i++];
                j++;
            }
        }
        
        //c.size = size + b.size;
        c.length = k;
        return c;
    }
    
    public Array_ADT diff(Array_ADT b)
    {
        int i,j,k;
        i = j = k = 0;
        Array_ADT c = new Array_ADT(size + b.size);
        while(i<length && j<b.length)
        {
            if(a[i]<b.a[j])
                c.a[k++] = a[i++];
            else if(a[i]>b.a[j]) 
                c.a[k++] = b.a[j++];
            else
            {
                i++;
                j++;
            }
        }
        for(;i<length;i++)
            c.a[k++] = a[i];
        for(;j<b.length;j++)
            c.a[k++] = b.a[j];
        //c.size = size + b.size;
        c.length = k;
        return c;
    }
    
    
}
