package Asignment_08_Strings;

public class Valid_Palindrome {
    public static void main(String[] args) {
        //Input: s = "A man, a plan, a canal: Panama"
        //Output: true
        //Explanation: "amanaplanacanalpanama" is a palindrome.
       // char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        String s = "0P";
        StringBuilder builder = new StringBuilder();
        String str=s.toLowerCase();
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(  ((ch>='a') && (ch<='z')) || ((ch>='0') && (ch<='9')))
            {
                builder.append(ch);
            }

        }

        String oldString = builder.toString();
        String reverse = String.valueOf(builder.reverse());
        System.out.println(oldString);
        System.out.println(reverse);

        if(oldString.matches(reverse))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }



    }
}
