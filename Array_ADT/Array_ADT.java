package DSA.Arrays_ADT;

import java.util.*;

public class Array_ADT
{
    // Vars for defining ADT
    int A[];
    int size;
    int length;

    public Array_ADT()
    {
        this(16);
    }

    public Array_ADT(int size)
    {
        this.size = size;
        A = new int[size];
        this.length = 0;
    }

    public boolean isEmpty()
    {
        return this.length == 0;
    }

    public boolean isFull()
    {
        return this.size == this.length;
    }

    public int getSize()
    {
        return this.size;
    }

    public int getLength()
    {
        return this.length;
    }

    public void display()
    {
        System.out.println("Array is: ");
        int i;
        for(i=0;i<this.length;i++)
        {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    public void append(int x)
    {
        if(this.length < this.size)
        {
            A[length] = x;
            length++;
        }
        else
        {
            System.out.println("Array size exceeded");
            return;
        }
    }

    public void insert(int x, int pos)
    {
        if(pos>0 && pos<=this.length)
        {
            for(int i=length;i>=pos;i--)
            {
                A[i] = A[i-1];
            }
            A[pos] = x;
            length++;
        }
        else
        {
            System.out.println("INVALID SIZE");
        }
    }

    public int delete(int index)
    {
        int x=-1;
        if(index>=0 && index<this.length)
        {
            x = A[index];
            for(int i=index;i<length-1;i++)
            {
                A[i] = A[i+1];
            }
            this.length--;
        }
        return x;
    }

    public void swap(int a, int b)
    {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }

    public int LinearSearch(int item)
    {
        for(int i=0;i<this.length;i++)
        {
            if(A[i] == item)
            {
                return i;
            }
        }
        return -1;
    }

    public int LinearSearchIMP(int item)
    {
        for(int i=0;i<this.length;i++)
        {
            if(A[i] == item)
            {
                swap(i,0);
                return i;
            }
        }
        return -1;
    }

    public int BinarySearch(int key)
    {
        int l,h,mid;
        l = 0;
        h = this.length-1;
        while(l<=h)
        {
            mid = (l+h)/2;
            if(A[mid] == key)
            {
                return mid;
            }
            else if(A[mid]>key)
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return -1;
    }

    public int RbinSearch(int key)
    {
        return RbinSearch(0,this.length-1,key);
    }

    public int RbinSearch(int l, int h, int key)
    {
        int mid;
        while(l<=h)
        {
            mid = (l+h)/2;
            if(A[mid] == key)
                return mid;
            else if(A[mid]<key)
                return RbinSearch(mid+1,h,key);
            else
                return RbinSearch(l,mid-1,key);
        }
        return -1;
    }

    public int get(int index)
    {
        if(index>=0 && index<this.length)
            return A[index];
        return -1;
    }

    public void set(int index, int n)
    {
        if(index>=0 && index<this.length)
            A[index] = n;
    }

    public int max()
    {
        int max = A[0];
        for(int i=0;i<this.length;i++)
        {
            if(A[i]>max)
                max = A[i];
        }
        return max;
    }

    public int min()
    {
        int min = A[0];
        for(int i=0;i<this.length;i++)
        {
            if(A[i]<min)
                min = A[i];
        }
        return min;
    }

    public int sum()
    {
        int sum = 0;
        for(int i=0;i<this.length;i++)
        {
            sum += A[i];
        }
        return sum;
    }

    public double avg()
    {
        double avg = (double)sum()/this.length;
        return avg;
    }

    public void reverse()
    {
        int B[] = new int[this.length];

        for(int i=this.length-1,j=0;i>=0;i--,j++)
        {
            B[j] = A[i];
        }

        for(int i=0;i<this.length;i++)
        {
            A[i] = B[i];
        }
    }

    public void reverse2()
    {
        for(int i=0,j=this.length-1;i<j;i++,j--)
        {
            swap(i,j);
        }

    }

    // implement left shift right shift

    public void leftShift()
    {
        for(int i=0;i<this.length-1;i++)
        {
            A[i] = A[i+1];
        }
        A[length-1] = 0;
    }

    public void rightShift()
    {
        for(int i=this.length;i>0;i--)
        {
            A[i] = A[i-1];
        }
        A[0] = 0;
    }

    public void leftRotate()
    {
        int x = A[0];
        for(int i=0;i<this.length-1;i++)
        {
            A[i] = A[i+1];
        }
        A[length-1] = x;
    }

    public void rightRotate()
    {
        int x = A[length-1];
        for(int i=this.length;i>0;i--)
        {
            A[i] = A[i-1];
        }
        A[0] = x;
    }

    public void insertSorted(int x)
    {
        if(isSorted())
        {
            int i=this.length-1;
            while(x<A[i])
            {
                A[i+1]=A[i];
                i--;
            }
            A[i+1]=x;
            this.length++;
        }
        else
        {
            System.out.println("The array is not sorted in the first place");
        }
    }

    public boolean isSorted()
    {
        for(int i=0;i<this.length-1;i++)
        {
            if(A[i]>A[i+1])
                return false;
        }
        return true;
    }

    public void rearrange()
    {
        int i,j;
        i = 0;
        j = this.length-1;
        while(i<j)
        {
            while(A[i]<0){i++;}
            while(A[j]>=0){j--;}
            if(i<j){
                swap(i,j);
            }
        }
    }

    public Array_ADT merge(Array_ADT B)
    {
        Array_ADT C = new Array_ADT(this.size + B.size);
        int i,j,k;
        i=j=k=0;
        
        while(i<this.length && j<B.length)
        {
            if(A[i]<B.A[j])
            {
                C.A[k++] = A[i++];
            }
            else
            {
                C.A[k++] = B.A[j++];
            }
        }
        for(;i<this.length;i++)
            C.A[k++] = A[i];
        for(;j<B.length;j++)
            C.A[k++] = B.A[j];
        C.length = k;
        return C;
    }
    
    public Array_ADT union(Array_ADT B)
    {
        Array_ADT C = new Array_ADT(this.size + B.size);
        
        int i,j,k;
        i=j=k=0;
        
        while(i<this.length && j<B.length)
        {
            if(A[i]<B.A[j])
            {
                C.A[k++] = A[i++];
            }
            else if(A[i]>B.A[j])
            {
                C.A[k++] = B.A[j++];
            }
            else
            {
                C.A[k++] = A[i++];
                j++;
            }
        }
        
        for(;i<this.length;i++)
            C.A[k++] = A[i];
        for(;j<B.length;j++)
            C.A[k++] = B.A[j];
        C.length = k;
        
        return C;
    }
    
    public Array_ADT intersection(Array_ADT B)
    {
        Array_ADT C = new Array_ADT(this.size + B.size);
        int i,j,k;
        i=j=k=0;
        while(i<this.length && j<B.length)
        {
            if(A[i]<B.A[j])
                i++;
            else if(A[i]>B.A[j])
                j++;
            else
            {
                C.A[k++] = A[i++];
                j++;
            }
        }
        
        
        C.length = k;
        return C;
    }
    
    public Array_ADT differnce(Array_ADT B)
    {
        Array_ADT C = new Array_ADT(this.size + B.size);
        int i,j,k;
        i=j=k=0;
        while(i<this.length && j<B.length)
        {
            if(A[i]<B.A[j])
                C.A[k++] = A[i++];
            else if(A[i]>B.A[j])
                j++;
            else
            {
                i++;
                j++;
            }
        }
        
        for(;i<this.length;i++)
            C.A[k++] = A[i];
        C.length = k;
        return C;
    }
    
}
