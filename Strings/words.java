package DSA;


/**
 * Write a description of class words here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class words
{
    public int word(char ar[])
    {
        int i;
        int w = 0;
        for(i=0;ar[i]!='\u0000';i++)
        {
            if(ar[i]==' ' && ar[i-1]!=' ')
                w++;
        }
        return w;
    }
    
    public static void main()
    {
        char name[] = {'s','T','r','I','n','G',' ','s','T','r','I','n','G','\u0000'};
        words ob = new words();
        System.out.print(ob.word(name)+1);
    }
}
