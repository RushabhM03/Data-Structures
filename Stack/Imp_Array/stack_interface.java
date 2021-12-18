package DSA;


/**
 * Write a description of interface stack_interface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface stack_interface
{
    boolean isEmpty();
    
    boolean isFull();
    
    int stackTop();
    
    int peek(int pos);
    
    void push(int x);
    
    int pop();
    
    void display();
    
    
}
