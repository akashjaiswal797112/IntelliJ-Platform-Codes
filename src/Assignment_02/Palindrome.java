package Assignment_02;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=1002;

        int tot=0;

            while(a!=0) {
                int temp = a % 10; //4//102
                tot = tot * 10 + temp;
                a = a / 10;

            }
        System.out.println(tot);

    }
}
