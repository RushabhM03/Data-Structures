package DSA;


/**
 * Write a description of class isAlphaNum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class isAlphaNum
{
    public boolean check(char ar[])
    {
        int i;
        for(i=0;ar[i]!='\u0000';i++)
        {
            if(!(ar[i]>=65 && ar[i]<=90)&&!(ar[i]>=97 && ar[i]<=122)&&!(ar[i]>=48 && ar[i]<=57))
                return false;
        }
        return true;
    }
    
    public static void main()
    {
        char name[] = {'s','T','r','I','n','G','\u0000'};
        isAlphaNum ob = new isAlphaNum();
        System.out.println(ob.check(name));
    }
}
