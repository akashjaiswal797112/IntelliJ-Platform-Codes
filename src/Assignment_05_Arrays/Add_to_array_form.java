package Assignment_05_Arrays;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Add_to_array_form {
    public static void main(String[] args) {
        //Input: num = [1,2,0,0], k = 34
        //Output: [1,2,3,4]
        //Explanation: 1200 + 34 = 1234
        int count=0;
        int k=1;

        List<Integer> num = new ArrayList<>();
        num.add(9);
        num.add(9);



        ArrayList<Integer> list=new ArrayList<>();
        int n=num.size();


        for(int i=num.size()-1 ; i>=0;i--)
        {
            int sum = num.get(i) + k;
            list.add(sum % 10);
            k = sum/ 10;
        }


        // if After Adding k in the Number  k is not ZERO then do this
        while(k > 0)
        {
            list.add(k%10);
            k = k/ 10;
        }



        // Now Reverse the LIST
        Collections.reverse(list);
        // AT the end Return the list
        // return list;
        System.out.println(list);











    }
}
