package Asignment_08_Strings;

import java.util.Arrays;

public class Jewels_And_Stones {
    public static void main(String[] args) {
        //Input: jewels = "aA", stones = "aAAbbbb"
        //Output: 3

        String jewels = "aA";
        String stones = "aAAbbbb";



//       char[] ch=new char[stones.length()];
//        for (int i = 0; i < ch.length; i++) {
//            ch[i]=stones.charAt(i);
//        }

        int count=0;
        for (int i = 0; i < stones.length(); i++) {
            char ch = stones.charAt(i);

            for (int j = 0; j < jewels.length(); j++) {
                char ch2 = jewels.charAt(j);
                if (ch == ch2) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
