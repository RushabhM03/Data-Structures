package DSA;


public class chain
{
    
    
    public node_ht search(node_ht t, int k)
    {
        
        while(t!=null)
        {
            if(t.data == k)
            {
                return t;
                
            }
            t=t.next;
        }
        return null;
    }
    
    public void insert_sort(node_ht[] HT,int index, int data)
    {
        node_ht q,t;
        node_ht p = HT[index];      // node for moving around
        node_ht h = HT[index];      // node for header pointer
        
        q=null;
        t = new node_ht();
        t.data = data;
        t.next = null;
        
        if(p==null)
        {
            h = t;
            HT[index] = h;
        }
        else
        {
            while(p!=null && p.data<data)
            {
                q=p;
                p=p.next;
            }
            if(p==h)
            {
                t.next = h;
                h = t;
            }
            else
            {
                t.next = q.next;
                q.next = t;
            }
        }
    }
}
