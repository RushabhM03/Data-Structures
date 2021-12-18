package DSA;

import java.util.*;

public class polynomial implements poly_interface
{
    private int n;
    private term terms[];
    
    Scanner in = new Scanner(System.in);
    
    public polynomial(int n)
    {
        this.n = n;
        this.terms = new term[n];
        for(int i=0;i<n;i++)
            terms[i] = new term();
    }
    
    public void read()
    {
        System.out.println("Enter the terms first coeff then exp");
        for(int i=0;i<n;i++)
        {
            terms[i].coeff = in.nextInt();
            terms[i].exp = in.nextInt();
        }
    }
    
    public void display()
    {
        System.out.println("The polynomial is");
        for(int i=0;i<n;i++)
        {
            System.out.print(terms[i].coeff + "x^" + terms[i].exp + " + ");
        }
        System.out.println();
    }
    
    public float evaluate()
    {
        int x;
        System.out.println("Enter the value of x");
        x = in.nextInt();
        float res = 0.0f;
        for(int i=0;i<n;i++)
        {
            res += terms[i].coeff*(Math.pow(x, terms[i].exp));
        }
        return res;
    }
    
    public polynomial add(polynomial p2)
    {
        polynomial sum = new polynomial(n + p2.n);
        for(int i=0;i<sum.n;i++)
            sum.terms[i] = new term();
        int i=0,j=0,k=0;    
        
        while(i<n && j<p2.n)
        {
            if(terms[i].exp == p2.terms[j].exp)
            {
                sum.terms[k].coeff = terms[i].coeff + p2.terms[j++].coeff;
                sum.terms[k++].exp = terms[i++].exp;
            }
            
            else if(terms[i].exp > p2.terms[j].exp)
            {
                sum.terms[k++] = terms[i++];
            }
            
            else
            {
                sum.terms[k++] = p2.terms[j++];
            }
        }
        
        for(;i<n;i++)
            sum.terms[k++] = terms[i];
        
        for(;j<p2.n;j++)
            sum.terms[k++] = terms[j];
        sum.n = k; 
        return sum;
    }
    
    
}
