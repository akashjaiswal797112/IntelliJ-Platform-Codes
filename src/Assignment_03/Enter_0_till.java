package Assignment_03;

import java.util.Scanner;

public class Enter_0_till {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

int input=0,sum=0;
        while((input=sc.nextInt())!=0){

            sum+=input;
        }
        System.out.println(sum);
    }
}
