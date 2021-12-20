package DSA;


/**
 * Write a description of class to_lower here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class to_lower
{
    public void lower(char ar[])
    {
        int i;
        for(i=0;ar[i]!='\u0000';i++)
        {
            
            if(ar[i] >= 65 && ar[i] <= 90)
            {
                ar[i] += 32;
            }
        }
    }

    public static void main()
    {
        char name[] = {'s','T','r','I','n','G','\u0000'};
        to_lower ob = new to_lower();
        ob.lower(name);
        for(int i=0;name[i]!='\u0000';i++)
            System.out.print(name[i]);
    }
}
