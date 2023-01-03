package Asignment_08_Strings;

public class Strings_Equivalent {
    public static void main(String[] args) {
        //Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
        //Output: true

        String[] word1 ={"ab","c"};
        String[] word2 = {"a","bc"};
        String s1="";
        String s2="";
        for(int i=0;i<word1.length;i++)
            s1+=word1[i];
        for(int j=0;j<word2.length;j++)
            s2+=word2[j];
        System.out.println(s1.equals(s2));

    }
}
