package DSA;



public interface dll_interface
{
    // returns the length of the doubly linked list
    int length();
    
    // displays the linked list in "<-->" form
    void display();
    
    // inserts an element x at position pos
    void insert(int pos, int x);
    
    // deletes the elemsnt at position pos
    int delete(int pos);
    
    // reverses the links in the doubly linked list
    void reverse();
   
}
