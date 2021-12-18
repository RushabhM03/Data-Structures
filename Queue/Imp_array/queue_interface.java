package DSA;



public interface queue_interface
{
    boolean isEmpty();
    
    boolean isFull();
    
    void enqueue(int x);
    
    int dequeue();
    
    void display();
}
