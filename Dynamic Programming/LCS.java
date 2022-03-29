package DSA;

import java.util.*;

public class LCS
{
    String s1;
    String s2;
    int LCS[][];

    public LCS(String s1, String s2)
    {
        this.s1 = s1;
        this.s2 = s2;

        LCS = new int[s1.length()+1][s2.length()+1]; 
    }

    public int LCS()
    {
        for(int i=1;i<=s1.length();i++)
        {
            for(int j=1;j<=s2.length();j++)
            {
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    LCS[i][j] = 1 + LCS[i-1][j-1];
                else
                    LCS[i][j] = Math.max(LCS[i-1][j], LCS[i][j-1]);
            }
        }
        return LCS[s1.length()][s2.length()];
    }

    public void display()
    {
        for(int i=0;i<=s1.length();i++)
        {
            for(int j=0;j<=s2.length();j++)
            {
                System.out.print(LCS[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public void diff(int i, int j)
    {
        if(i > 0 && j > 0 && (s1.charAt(i - 1) == s2.charAt(j - 1))){
            diff(i-1, j-1);
            System.out.print(" "+s1.charAt(i-1));
        }
        
        else if(j > 0 && ( i == 0 || LCS[i][j-1] >= LCS[i-1][j])){
            diff(i, j-1);
            //System.out.print(" +"+s2.charAt(j-1));
        }
        else if(i > 0 && (j == 0 || LCS[i-1][j] > LCS[i][j-1])){
            diff(i-1, j);
            //System.out.print(" -"+s1.charAt(i-1));
        }
    }
    
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter 2 strings");
        s1 = in.nextLine();
        s2 = in.nextLine();
        LCS ob = new LCS(s1,s2);
        System.out.println("Length of LCS = "+ob.LCS());
        ob.display();
        ob.diff(s1.length(), s2.length());
    }
}
