package Topics_DSA;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int[] arr =new int[5];
        for (int i=0;i<5;i++){
            Scanner sc=new Scanner(System.in);
            arr[i]=sc.nextInt();
        }


        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        for (int num :arr) {
            System.out.println(num);
        }
        System.out.println(Arrays.toString(arr));
    }
}
