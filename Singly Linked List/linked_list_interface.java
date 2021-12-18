package DSA;


/**
 * Write a description of interface linked_list_interface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface linked_list_interface
{
    int length();
    
    int sum();
    
    boolean search(int k);
    
    void insert(int pos, int x);
    
    void insert_sort(int data);
    
    int delete(int pos);
    
    boolean isSorted();
    
    void remove_dup();
    
    void reverse();
    
    void display();
    
    void concat(linked_list l2);
    
    void merge(linked_list l2);
    
    
}
