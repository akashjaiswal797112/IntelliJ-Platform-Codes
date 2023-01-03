package Assignment_05_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Concatenation {
    public static void main(String[] args) {
        int[] num={1,2,3};
     int[] arr=new int[num.length*2];

        int i;
        for ( i = 0; i < num.length; i++) {
            arr[i]=num[i];
            System.out.println(arr[i]);

        }

        int x=num.length;
        int z=0;
        for (int j = x; j < arr.length; j++,z++) {

            if(z< num.length) {
                int a = j - (j-z);

                arr[j] = num[a];
                 System.out.println(arr[j]);
            }

        }

    }
}
