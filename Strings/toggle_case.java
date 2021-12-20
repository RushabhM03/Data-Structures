package DSA;

/**
 * changes an the case in a string
 */
public class toggle_case
{
    public void toggle(char ar[])
    {
        int i;
        for(i=0;ar[i]!='\u0000';i++)
        {
            if(ar[i] >= 65 && ar[i] <= 90)
            {
                ar[i] += 32;
            }
            else if(ar[i] >= 97 && ar[i] <= 122)
            {
                ar[i] -= 32;
            }
        }
    }

    public static void main()
    {
        char name[] = {'s','T','r','I','n','G','\u0000'};
        toggle_case ob = new toggle_case();
        ob.toggle(name);
        for(int i=0;name[i]!='\u0000';i++)
            System.out.print(name[i]);
    }
}
