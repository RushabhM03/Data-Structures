package DSA;

import java.util.*;

// The huffman node class
class node
{
    int freq;       // frequency
    String symbol;    // character
    node left;      // Left child
    node right;     // Right child
    int huff;    // (0/1)
    
    public node(int freq, String symbol, node left, node right)
    {
        this.freq = freq;
        this.symbol = symbol;
        this.left = left;
        this.right = right;
    }
}

// main class
public class huffman
{
    public void print(node n, String s)
    {
        
        String newS = s + n.huff;
        if(n.left != null)
            print(n.left, newS);
        if(n.right!=null)
            print(n.right, newS);
            
        if(n.left==null && n.right==null)
        {
            if(newS.length()>2 && newS.charAt(0) == '0')
            {
                newS = newS.substring(1);
            }
            
            System.out.println(n.symbol +"-->"+newS);
        }
        
    }
    
    public void find(String c[], int f[])
    {
        int n = c.length;
        ArrayList<node> nodes = new ArrayList<node>();
        
        for(int i=0;i<n;i++)
        {
            nodes.add(new node(f[i], c[i], null,null));
        }
        
        // generate the tree
        while(nodes.size()>1)
        {
            sort(nodes);
            
            node left = nodes.get(0);
            node right = nodes.get(1);
            
            left.huff = 0;
            right.huff = 1; 
            
            node newNode = new node(left.freq+right.freq, left.symbol+right.symbol, left, right);
            
            nodes.remove(left);
            nodes.remove(right);
            nodes.add(newNode);
        }
        
        print(nodes.get(0),"");
        
    }
    
    public static void sort(ArrayList<node> list)
    {
  
        list.sort((o1, o2)
                      -> o1.freq-(
                          o2.freq));
    }
    
    public static void main()
    {
        // array of characters
        String chars[] = {"a", "b", "c", "d", "e", "f"};
        
        // array of frequencies
        int freq[] = {5, 9, 12, 13, 16, 45};
        
        huffman ob = new huffman();
        ob.find(chars, freq);
    }
}
