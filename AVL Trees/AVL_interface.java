package DSA;


/**
 * Write a description of interface AVL_interface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface AVL_interface
{
    void inorder(AVL_Node p);
    
    int Nodeheight(AVL_Node p);
    
    int balance_factor(AVL_Node p);
    
    AVL_Node LL_rotation(AVL_Node p);
    
    AVL_Node LR_rotation(AVL_Node p);
    
    AVL_Node RL_rotation(AVL_Node p);
    
    AVL_Node RR_rotation(AVL_Node p);
    
    AVL_Node recursive_insert(AVL_Node p, int key);
    
    AVL_Node delete(AVL_Node p, int key);
}
