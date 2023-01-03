package Assignment_03;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int prod=1;
        int num=sc.nextInt();
        for(int i=num;i>=1;i--){
            prod*=i;
        }
        System.out.println(prod);

    }
}
