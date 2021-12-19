package DSA;

import java.util.*;

public class tree_test
{
    public static void main()
    {
        Tree_binary t = new Tree_binary();
        t.create();
        
        System.out.println("PREORDER");
        t.preorder();
        System.out.println();
        System.out.println("POSTORDER");
        t.postorder();
        System.out.println();
        System.out.println("INORDER");
        t.inorder();
        System.out.println();
        System.out.println("LEVELORDER");
        t.levelorder();
        System.out.println();
        System.out.println(t.height());
        
        
        System.out.println(t.hasLeftChild(t.getRoot()));
        System.out.println(t.hasRightChild(t.getRoot()));
        System.out.println(t.isLeafNode(t.getRoot()));
        System.out.println(t.degree(t.getRoot()));
        
        System.out.println(t.count(t.getRoot()));
        System.out.println(t.count(t.getRoot().left));
        System.out.println(t.sum());
        
        System.out.println(t.count_external_nodes());
        System.out.println(t.count_internal_nodes());
        System.out.println(t.count_complete_nodes());
    }
}
