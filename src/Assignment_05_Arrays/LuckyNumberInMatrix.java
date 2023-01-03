package Assignment_05_Arrays;

import java.util.Scanner;

public class LuckyNumberInMatrix {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
//Output: [15]

        int[][] matrix={{7,  3,  8},   //00 01 02
                {9,  11, 13},  //10 11 12
                {15, 16, 17}}; //20 21 22
        int len= matrix.length;
        int[] arr=new int[len];

        int large=0;

        for (int i = 0; i < len; i++) {
            large=matrix[i][0];
            for (int j = 0; j < len; j++)
            {
                if(matrix[i][j]<large)
                {
                    large=matrix[i][j];
                }

            }

            arr[i]=large;

        }


        for (int k = 0; k < arr.length; k++) {

            if(arr[k]>large)
            {
                large=arr[k];
            }

        }
        System.out.println(large);





    }

}
