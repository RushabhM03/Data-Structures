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
    }
}
