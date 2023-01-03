package Rough;

public class Solve {
    public static void main(String[] args) {

        String s="Akash Jaiswal";
        String rev="";
        int t=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                char ch=s.charAt(i);
                rev=ch+rev;
                t=i;


            }
            else
            {
                for (i=t+1;i<s.length();i++)
                {
                    char ch=s.charAt(i);
                    rev=ch+rev;
                    t=i;

                }
            }



        }

    }
}
