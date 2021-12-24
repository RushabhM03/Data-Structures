package DSA;


/**
 * Write a description of class AVL_test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AVL_test
{
    

    public static void main()
    {
        AVL_tree t = new AVL_tree();
        t.root = t.recursive_insert(t.root,10);
        t.recursive_insert(t.root,5);
        t.recursive_insert(t.root,20);
        t.recursive_insert(t.root,30);
        //t.recursive_insert(t.root,20);
        t.inorder(t.root);
        t.delete(t.root,5);
        t.inorder(t.root);
    }
}
