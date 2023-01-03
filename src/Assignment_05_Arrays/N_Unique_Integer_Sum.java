package Assignment_05_Arrays;

import java.util.Scanner;

public class N_Unique_Integer_Sum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n =3,sum=0 ,negative = 0;
        int[] res = new int[n];

        if(n==1)
        {
            res[0]=0;
            System.out.println("if block");
        }
        else
        {
            for (int i = 1; i < n; i++) {
                sum=i+sum;
                negative = i*(-1);
                res[i]=negative;

            }
            res[0]=sum;

        }
        for (int k = 0; k < n; k++) {
            System.out.println(res[k]);
        }


    }
}
