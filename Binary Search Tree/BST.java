package DSA;



public class BST implements BST_interface
{
    public BST_Node root;
    
    BST()
    {
        root = null;
    }
    
    public boolean isEmpty()
    {
        return root==null;
    }
    
    public BST_Node recursive_insert(int key)
    {
        return recursive_insert(root, key);
    }
    
    public BST_Node recursive_insert(BST_Node p, int key)
    {
        BST_Node t= null;
        if(p==null)
        {
            t = new BST_Node();
            t.data = key;
            t.left = t.right = null;
            return t;
        }
        if(key<p.data)
            p.left = recursive_insert(p.left, key);
        else if(key>p.data)
            p.right = recursive_insert(p.right, key);
        return p;
    }
    
    public void insert(int key)
    {
        BST_Node t = root;
        BST_Node p,r;
        r = null;
        
        if(root == null)
        {
            p = new BST_Node();
            p.data = key;
            p.left = p.right = null;
            root = p;
            return;
        }
        
        while(t!=null)
        {
            r = t;
            if(key == t.data)
                return;
            else if(key<t.data)
                t = t.left;
            else
                t = t.right;
        }
        
        p = new BST_Node();
        p.data = key;
        p.left = p.right = null;
        if(p.data<r.data)
            r.left = p;
        else
            r.right = p;
    }
    
    public int height(BST_Node p)
    {
        int x,y;
        if(p==null)
            return 0;
        x = height(p.left);
        y = height(p.right);
        return x>y?x+1:y+1;
    }
    
    public BST_Node InPre(BST_Node p)
    {
        while(p!=null && p.right!=null)
        {
            p = p.right;
        }
        return p;
    }
    
    public BST_Node InSucc(BST_Node p)
    {
        while(p!=null && p.left!=null)
        {
            p = p.left;
        }
        return p;
    }
    
    public BST_Node delete(BST_Node p, int key)
    {
        BST_Node q;
        if(p==null) 
            return null;
        if(p.left == null && p.right == null)
        {
            if(p == root)
                root = null;
            p = null;
            return null;
        }
        
        if(key<p.data)
            p.left = delete(p.left, key);
        else if(key>p.data)
            p.right = delete(p.right, key);
        else
        {
            if(height(p.left)>height(p.right))
            {
                q = InPre(p.left);
                p.data = q.data;
                p.left = delete(p.left, q.data);
            }
            else
            {
                q = InSucc(p.right);
                p.data = q.data;
                p.right = delete(p.right, q.data);
            }
        }
        return p;
    }
    
    public BST_Node search(int key)
    {
        BST_Node t = root;
        while(t!=null)
        {
            if(t.data == key)
                return t;
            else if(key<t.data)
                t = t.left;
            else
                t = t.right;
        }
        return null;
    }
    
    public BST_Node recursive_search(int key)
    {
        return recursive_search(root, key);
    }
    
    public BST_Node recursive_search(BST_Node t, int key)
    {
        if(t == null)
            return null;
        if(key == t.data)
            return t;
        else if(key<t.data)
            return recursive_search(t.left, key);
        else
            return recursive_search(t.right, key);
    }
    
    public void inorder(BST_Node p)
    {
        if(p!=null)
        {
            inorder(p.left);
            System.out.print(p.data + " ");
            inorder(p.right);
        }
        
    }
    
    public void create(int pre[], int n)
    {
        stack_ADT s = new stack_ADT();
        
        BST_Node t,p;
        int i=0;
        
        root = new BST_Node();
        root.data= pre[i++];
        root.left = root.right = null;
        p = root;
        
        while(i<n)
        {
            if(pre[i]<p.data)
            {
                t = new BST_Node();
                t.data = pre[i++];
                t.left = t.right = null;
                p.left = t;
                
            }
        }
    }
}
