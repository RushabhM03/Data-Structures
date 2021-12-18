package DSA;



public interface Array_interface
{
    // basic getter and setter methods.
    
    // returns element at that index
    int get(int index);
    
    // sets element at an index to x
    void set(int index, int x);
    
    // returns length of array
    int getLength();
    
    // returns max capacity of array
    int getSize();
    
    // operation methods
    
    // display the ADT array
    void display();
    
    // insert element x at index
    void insert(int index, int x);
    
    // insert element at the end of the array
    void append(int x);
    
    // delete element at index
    int delete(int index);
    
    // searching methods
    
    // linear search implementation
    int linear_search(int x);
    
    // binary search implementation
    int binsearch(int key);
    
    // recursive binary search implementation
    int recb_search(int l, int h, int key);  
    
    // math operation methods
    
    // sum of all elements of array
    int sum();
    
    // max element in the array
    int max();
    
    // returns min element in the array
    int min();
    
    // returns sum/length
    float avg();
    
    // modifying methods
    
    // reverse the array adt
    void reverse();
    
    // rotate the array one bit towards left
    void left_rotate();
    
    // rotate the array one bit towards right
    void right_rotate();
    
    // insert an element in a sorted array ADT
    void insert_sorted(int x);
    
    // returns true if array is sorted
    boolean isSorted();
    
    void rearrange();
    
    
    // set methods
    
    // merges two arrays
    Array_ADT merge(Array_ADT b);
    
    // gives union of 2 arrays
    Array_ADT union(Array_ADT b);
    
    // gives the common elements of 2 arrays
    Array_ADT intersection(Array_ADT b);
    
    // gives set A -set B
    Array_ADT diff(Array_ADT b);    
}
