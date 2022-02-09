package DSA.Arrays_ADT;



public interface Array_interface
{
    // returns true if array is empty
    public boolean isEmpty();
    
    // returns true if array is full
    public boolean isFull();
    
    // returns the size of the array
    int getSize();
    
    // returns the length of the array
    int getLength();
    
    // displays the array
    void display();
    
    // inserts a element at the end of the array
    void append(int x);
    
    // inserts an element at any position in the array
    void insert(int x, int item);
    
    // deletes an element from the array
    int delete(int index);
    
    // swaps a[i]  and a[j]
    void swap(int i,int j);
    
    // linear search algorithm
    int LinearSearch(int item);
    
    // binary search algorithm
    int BinarySearch(int item);
    
    // returns element at that index
    int get(int index);
    
    // sets a[index] to n
    void set(int index, int n);
    
    // returns the max element of the array
    int max();
    
    // returns the minimum element of the array
    int min();
    
    // gives the sum of all elements in the array
    int sum();
    
    // gives the average of all elements in the array
    double avg();
    
    // reverses the array
    void reverse();
    
    // left shift the array by 1 bit
    void leftShift();
    
    // right shift the array by 1 bit
    void rightShift();
    
    // left rotate the array by 1 bit
    void leftRotate();
    
    // right rotate the array by 1 bit
    void rightRotate();
    
    // insert an element in a sorted array keeping the order
    void insertSorted(int x);
    
    // returns true if array is sorted
    boolean isSorted();
    
    // keeps negative numbers on left side of the array and positive on the right side
    void rearrange();
    
    // set methods
    
    // merges 2 sets/arrays
    Array_ADT merge(Array_ADT B);
    
    // union od 2 sets
    Array_ADT union(Array_ADT B);
    
    // intersection of 2 sets
    Array_ADT intersection(Array_ADT B);
    
    // retuens setA - setB
    Array_ADT differnce(Array_ADT B);
    
}
