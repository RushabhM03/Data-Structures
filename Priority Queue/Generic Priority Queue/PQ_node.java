package DSA;

public class PQ_node <T>
{
    int priority;
    T position_name;
    
    PQ_node()
    {
        this.priority = -1;
        this.position_name = null;
    }
    
    PQ_node(T name, int p)
    {
        this.position_name = name;
        this.priority = p;
    }
}
