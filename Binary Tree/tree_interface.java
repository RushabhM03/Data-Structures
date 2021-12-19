package DSA;


/**
 * Write a description of interface tree_interface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface tree_interface
{
    void create();
    
    void preorder();
    
    void postorder();
    
    void inorder();
    
    void levelorder();
    
    int height();
    
    Tree_Node getRoot();
    
    int degree(Tree_Node p);
    
    boolean hasLeftChild(Tree_Node p);
    
    boolean hasRightChild(Tree_Node p);
    
    boolean isLeafNode(Tree_Node p);
    
    int count(Tree_Node p);
    
    int sum();
    
    int count_external_nodes();
    
    int count_internal_nodes();
    
    int count_complete_nodes();
    
}
