package DSA;

import java.util.*;


public class Tree_binary implements tree_interface
{
    Queue_node q = new Queue_node(100);
    private Tree_Node root;

    Scanner in = new Scanner(System.in);

    Tree_binary()
    {
        root = null;
    }
    
    public Tree_Node getRoot()
    {
        return root;
    }
    
    public boolean hasLeftChild(Tree_Node p)
    {
        if(p==null)
            return false;
        return p.left != null;
    }
    
    public boolean hasRightChild(Tree_Node p)
    {
        if(p==null)
            return false;
        return p.right != null;
    }
    
    public boolean isLeafNode(Tree_Node p)
    {
        if(p==null)
            return false;
        return !hasLeftChild(p) && !hasRightChild(p);
    }
    
    public int degree(Tree_Node p)
    {
        if(isLeafNode(p)|| p==null)
            return 0;
        else if((hasLeftChild(p) && !hasRightChild(p)) || (!hasLeftChild(p) && hasRightChild(p)))
            return 1;
        else
            return 2;
        
    }
    
    public void preorder()
    {
        preorder(root);
    }
    
    public void postorder()
    {
        postorder(root);
    }
    
    public void inorder()
    {
        inorder(root);
    }
    
    public void levelorder()
    {
        levelorder(root);
    }
    
    public int height()
    {
        return height(root);
    }
    
    public void create()
    {
        Tree_Node p,t;
        int x;

        System.out.println("Enter root value");
        root = new Tree_Node();
        root.data = in.nextInt();
        root.left= root.right = null;

        q.enqueue(root);

        while(! q.isEmpty())
        {
            p = q.dequeue();
            System.out.println("Enter the left child of "+ p.data);
            x = in.nextInt();

            if(x!=-1)
            {
                t = new Tree_Node();
                t.data = x;
                t.left = t.right = null;
                p.left = t;
                q.enqueue(t);
            }

            System.out.println("Enter the right child of "+p.data);
            x = in.nextInt();

            if(x!=-1)
            {
                t = new Tree_Node();
                t.data = x;
                t.left = t.right = null;
                p.right = t;
                q.enqueue(t);
            }         
        }
    }

    public void preorder(Tree_Node p)
    {
        if(p!=null)
        {
            System.out.print(p.data+"\t");
            preorder(p.left);
            preorder(p.right);
        }
        
    }

    public void postorder(Tree_Node p)
    {
        if(p!=null)
        {           
            postorder(p.left);
            
            postorder(p.right);
            System.out.print(p.data+"\t");
        }
        
    }

    public void inorder(Tree_Node p)
    {
        if(p!=null)
        {           
            inorder(p.left);
            System.out.print(p.data+"\t");
            inorder(p.right);
        }
        
    }

    public void levelorder(Tree_Node p)
    {
        Queue_node q2 = new Queue_node(100);
        System.out.print(p.data+"\t");
        q2.enqueue(p);
        while(!q2.isEmpty())
        {
            p = q2.dequeue();
            if(p.left!=null)
            {
                System.out.print(p.left.data+"\t");
                q2.enqueue(p.left);
            }
            
            if(p.right!=null)
            {
                System.out.print(p.right.data+"\t");
                q2.enqueue(p.right);
            }
        }
        System.out.println();
    }
    
    public int height(Tree_Node root)
    {
        int x=0, y=0;
        if(root==null)
            return 0;
        x = height(root.left);
        y = height(root.right);
        if(x>y)
            return x+1;
        else
            return y+1;
    }   
    
    public int count(Tree_Node p)
    {
        int x,y;
        if(p!=null)
        {
            x = count(p.left);
            y = count(p.right);
            return x+y+1;
        }
        return 0;
    }
    
    public int sum()
    {
        return sum(root);
    }
    
    public int sum(Tree_Node p)
    {
        int x,y;
        if(p!=null)
        {
            x = sum(p.left);
            y = sum(p.right);
            return x+y+p.data;
        }
        return 0;
    }
    
    public int count_external_nodes()
    {return count_external_nodes(root);}
    
    public int count_external_nodes(Tree_Node p)
    {
        int x,y;
        if(p!=null)
        {
            x = count_external_nodes(p.left);
            y = count_external_nodes(p.right);
            if(!hasLeftChild(p) && !hasRightChild(p))
                return x+y+1;
            else
                return x+y;
        }
        return 0;
    }
    
    public int count_internal_nodes()
    {return count_internal_nodes(root);}
    
    public int count_internal_nodes(Tree_Node p)
    {
        int x,y;
        if(p!=null)
        {
            x = count_internal_nodes(p.left);
            y = count_internal_nodes(p.right);
            if(hasLeftChild(p) || hasRightChild(p))
                return x+y+1;
            else
                return x+y;
        }
        return 0;
    }
    
    public int count_complete_nodes()
    {return count_complete_nodes(root);}
    
    public int count_complete_nodes(Tree_Node p)    // complete nodes are nodes with degree 2
    {
        int x,y;
        if(p!=null)
        {
            x = count_complete_nodes(p.left);
            y = count_complete_nodes(p.right);
            if(hasLeftChild(p) && hasRightChild(p))
                return x+y+1;
            else
                return x+y;
        }
        return 0;
    }
}
