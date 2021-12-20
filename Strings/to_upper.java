package DSA;


/**
 * convert to upper case
 */
public class to_upper
{
    public void upper(char ar[])
    {
        int i;
        for(i=0;ar[i]!='\u0000';i++)
        {
            
            if(ar[i] >= 97 && ar[i] <= 122)
            {
                ar[i] -= 32;
            }
        }
    }

    public static void main()
    {
        char name[] = {'s','T','r','I','n','G','\u0000'};
        to_upper ob = new to_upper();
        ob.upper(name);
        for(int i=0;name[i]!='\u0000';i++)
            System.out.print(name[i]);
    }
}
