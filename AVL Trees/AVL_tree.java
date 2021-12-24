package DSA;

import java.util.*;

public class AVL_tree
{
    AVL_Node root;
    
    AVL_tree()
    {
        root = null;
    }
    
    public int Nodeheight(AVL_Node p)
    {
        int hl,hr;
        hl = (p!=null && p.left!=null)?p.left.height:0;
        hr = (p!=null && p.right!=null)?p.right.height:0;
        return ((hl>hr)?hl+1:hr+1);
    }
    
    int balance_factor(AVL_Node p)
    {
        int hl,hr;
        hl = (p!=null && p.left!=null)?p.left.height:0;
        hr = (p!=null && p.right!=null)?p.right.height:0;
        return hl-hr;
    }
    
    public AVL_Node LL_rotation(AVL_Node p)
    {
        AVL_Node pl = p.left;
        AVL_Node plr = pl.right;
        
        pl.right = p;
        p.left = plr;
        
        p.height = Nodeheight(p);
        pl.height = Nodeheight(pl);
        
        if(root==p)
        {
            root = pl;
        }
        return pl;
    }
    
    public AVL_Node RR_rotation(AVL_Node p)
    {
        AVL_Node pr = p.right;
        AVL_Node prl = pr.left;
        
        pr.left = p;
        p.right = prl;
        
        p.height = Nodeheight(p);
        pr.height = Nodeheight(pr);
        
        if(root==p)
        {
            root = pr;
        }
        return pr;
    }
    
    public AVL_Node LR_rotation(AVL_Node p)
    {
        AVL_Node pl = p.left;
        AVL_Node plr = pl.right;
        
        pl.right = plr.left;
        p.left = plr.right;
        
        plr.left = pl;
        plr.right = p;
        
        // recalc height
        pl.height = Nodeheight(pl);
        p.height = Nodeheight(p);
        plr.height = Nodeheight(plr);
        
        if(root == p)
            root = plr;
        return plr;
    }
    
    public AVL_Node RL_rotation(AVL_Node p)
    {
        AVL_Node pr = p.right;
        AVL_Node prl = pr.left;
        
        pr.left = prl.right;
        p.right = prl.left;
        
        prl.right = pr;
        prl.left = p;
        
        // recalc height
        pr.height = Nodeheight(pr);
        p.height = Nodeheight(p);
        prl.height = Nodeheight(prl);
        
        if(root == p)
            root = prl;
        return prl;
    }
    
    public AVL_Node recursive_insert(AVL_Node p, int key)
    {
        AVL_Node t= null;
        if(p==null)
        {
            t = new AVL_Node();
            t.data = key;
            t.height = 1;  // here height of avl tree starts from 1
            t.left = t.right = null;                
            return t;
        }
        if(key<p.data)
            p.left = recursive_insert(p.left, key);
        else if(key>p.data)
            p.right = recursive_insert(p.right, key);
        p.height = Nodeheight(p);
        
        
        if(balance_factor(p) == 2 && balance_factor(p.left)==1)
            return LL_rotation(p);
        else if(balance_factor(p) == 2 && balance_factor(p.left)==-1)
            return LR_rotation(p);
        else if(balance_factor(p) == -2 && balance_factor(p.right)==-1)
            return RR_rotation(p);
        else if(balance_factor(p) == -2 && balance_factor(p.left)==1)
            return RL_rotation(p); 
        return p;
    }
    
    public void inorder(AVL_Node p)
    {
        if(p!=null)
        {
            inorder(p.left);
            System.out.print(p.data + " ");
            inorder(p.right);
        }     
    }
    
    public static void main()
    {
        AVL_tree t = new AVL_tree();
        t.root = t.recursive_insert(t.root,10);
        t.recursive_insert(t.root,20);
        t.recursive_insert(t.root,80);
        t.inorder(t.root);
    }
}
