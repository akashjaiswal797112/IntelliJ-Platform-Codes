package Topics_DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        //Input: n = 15
        //Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
        //answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
        //answer[i] == "Fizz" if i is divisible by 3.
        //answer[i] == "Buzz" if i is divisible by 5.
        //answer[i] == i (as a string) if none of the above conditions are true.

        int n = 15;
        List<String>li = new ArrayList<>();
        String[] str = new String[n];

        for (int i = 1; i <= n; i++) {
            if(i%3==0  && i%5==0)
            {
                li.add("FizzBuzz");
            }
            else if(i%3==0)
            {
                li.add("Fizz");
            }
           else if(i%5==0)
            {
                li.add("Buzz");
            }
           else
            {
                li.add(""+i);
            }
           str[i-1]=li.get(i-1);
        }

        System.out.println(li);
        System.out.println(Arrays.toString(str));



    }
}
