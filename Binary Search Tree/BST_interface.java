package DSA;


/**
 * Write a description of interface BST_interface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface BST_interface
{
    boolean isEmpty();
    
    void insert(int key);
    
    BST_Node recursive_insert(int key);
    
    BST_Node delete(BST_Node p, int key);
    
    
    BST_Node search(int key);
    
    BST_Node recursive_search(int key);
    
    void inorder(BST_Node p);
    
    int height(BST_Node p);
}
