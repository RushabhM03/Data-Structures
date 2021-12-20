package DSA;


/**
 * Write a description of class no_of_vowels here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class no_of_vowels_conso
{
    public int vowels(char ar[])
    {
        int i;
        int v = 0;
        for(i=0;ar[i]!='\u0000';i++)
        {
            if(ar[i]=='a' || ar[i]=='A' ||ar[i]=='e' || ar[i]=='E' ||ar[i]=='i' || ar[i]=='I' ||ar[i]=='o' || ar[i]=='O' ||ar[i]=='u' || ar[i]=='U')
            {
                v++;
            }
        }
        return v;
    }
    
    public int consonants(char ar[])
    {
        int i;
        int c = 0;
        for(i=0;ar[i]!='\u0000';i++)
        {
            if(ar[i]=='a' || ar[i]=='A' ||ar[i]=='e' || ar[i]=='E' ||ar[i]=='i' || ar[i]=='I' ||ar[i]=='o' || ar[i]=='O' ||ar[i]=='u' || ar[i]=='U')
            {
            }
            else if((ar[i]>=65 && ar[i]<=90) || (ar[i]>=97 && ar[i]<=122))
            {
                c++;
            }
        }
        return c;
    }
    
    public static void main()
    {
        char name[] = {'s','T','r','I','n','G',' ','\u0000'};
        no_of_vowels_conso ob = new no_of_vowels_conso();
        System.out.println(ob.vowels(name));
        System.out.println(ob.consonants(name));
    }
}
