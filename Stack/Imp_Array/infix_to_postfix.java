package DSA;

import java.util.*;

public class infix_to_postfix
{
    static Stack_LL exp = new Stack_LL();
    
    
    public boolean isOperand(char x)
    {
        if(x=='+' || x=='-' || x=='*' || x=='/')
            return false;
        return true;
    }
    
    public int presedence(char x)
    {
        if(x == '+' || x=='-')
            return 1;
        else if(x=='*' || x=='/')
            return 2;
        return 0;
    }
    
    public char[] convert(char[] infix)
    {
        char [] postfix = new char[infix.length+1];
        int i=0;
        int j=0;
        
        while(i<infix.length)
        {
            if(isOperand(infix[i]))
            {
                postfix[j++] = infix[i++];
            }
            else
            {
                if(presedence(infix[i])>presedence(exp.stackTop()))
                    exp.push(infix[i++]);
                else
                {
                    postfix[j++] = exp.pop();
                }         
            }
        }
        
        while(! exp.isEmpty())
        {
                postfix[j++] = exp.pop();
        }
        return postfix;
    }
    
    public int evaluate(char[] postfix)
    {
        int i,x1,x2,r;
        r = 0;
        stack_ADT s1 = new stack_ADT();
        
        for(i=0;i<postfix.length;i++)
        {
            if(isOperand(postfix[i]))
            {
                int c = postfix[i];
                s1.push(c-48);
            }
            else
            {
                x2 = s1.pop();
                x1 = s1.pop();
                
                switch(postfix[i])
                {
                    case '+': 
                    r = x1+x2;
                    s1.push(r);
                    break;
                    
                    case '-': 
                    r = x1-x2;
                    s1.push(r);
                    break;
                    
                    case '*': 
                    r = x1*x2;
                    s1.push(r);
                    break;
                    
                    case '/': 
                    r = x1/x2;
                    s1.push(r);
                    break;
                }
            }
        }
        
        return s1.pop();
    }
    
    public static void main()
    {
        char[] a = {'3', '*', '5', '+', '6', '/', '2', '-', '4'};
        infix_to_postfix ob = new infix_to_postfix();
        //exp.push('#');
        char [] b = ob.convert(a);
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]);
        }
        System.out.println();
        System.out.println(ob.evaluate(b));
    }
}
