package Asignment_08_Strings;

import static java.lang.System.exit;

public class Length_last_Word {
    public static void main(String[] args) {
        //Input: s = "   fly me   to   the moon  "
        //Output: 4
        //Explanation: The last word is "moon" with length 4.

        String s = "a";

            int count=0;
            boolean flag = false;
        for (int i = s.length()-1; i >= 0; i--) {
            if((s.charAt(i)==' '))
            {
                if(flag)
                {
                    System.out.println(count);
                    exit(0);
                }
            }
            else
            {
                count++;
                flag=true;
            }

        }



    }
}
