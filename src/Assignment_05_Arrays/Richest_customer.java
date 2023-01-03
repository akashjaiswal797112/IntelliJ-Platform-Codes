package Assignment_05_Arrays;

import java.util.Arrays;

public class Richest_customer {
    public static void main(String[] args) {
       // Input: accounts = [[1,2,3],[3,2,1]]
       // Output: 6

       int[][]  accounts = {{1,2,3},{3,2,1}};

        int[] sum=new int[accounts.length];
        int a=0,wealth=-1;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                a=a+accounts[i][j];
            }
            if(a>wealth)
            {
                wealth=a;
            }
            a=0;
        }
        System.out.println(wealth);


    }
}
