package DSA.q;


/**
 * Write a description of interface Deque_inter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Deque_inter
{
    boolean isEmpty();
    
    boolean isFull();
    
    void display();
    
    int getFRONT();
    
    int getREAR();
    
    void enqueue_REAR(int x);
    
    void enqueue_FRONT(int x);
    
    int dequeue_FRONT();
    
    int dequeue_REAR();
}
