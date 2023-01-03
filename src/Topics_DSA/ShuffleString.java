package Topics_DSA;

import java.sql.Struct;
import java.util.Arrays;

public class ShuffleString {
    public static void main(String[] args) {
        //Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
        //Output: "leetcode"
//String s = "codeleet";
//        int[] indices = {4,5,6,7,0,2,1,3};
//        char[] arr=new char[indices.length];
//
//        for (int i = 0; i < indices.length; i++) {
//
//            arr[indices[i]]=s.charAt(i);
//
//
//        }
//        System.out.println(Arrays.toString(arr));


        String s = "codeleet";

        int[] indices = {4,5,6,7,0,2,1,3};
        char[] arr=new char[indices.length];

        for (int i = 0; i < indices.length; i++) {
            arr[indices[i]]=s.charAt(i);
        }
        String output = new String(arr);
        System.out.println(output);



    }
}
