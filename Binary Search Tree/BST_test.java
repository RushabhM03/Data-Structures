package DSA;


/**
 * Write a description of class BST_test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BST_test
{
    public static void main()
    {
        BST ob = new BST();
        System.out.println(ob.isEmpty());
        ob.insert(10);
        ob.insert(5);
        ob.insert(20);
        ob.insert(8);
        ob.insert(30);
        ob.delete(ob.root, 8);
        ob.inorder(ob.root);
        System.out.println();
        BST_Node temp = ob.search(200);
        if(temp == null)
            System.out.println("NOt found");
        else
            System.out.println(temp.data+" is found");
        System.out.println(ob.isEmpty());
    }
}
