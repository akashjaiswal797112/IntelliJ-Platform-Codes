package Assignment_02;

import java.util.Scanner;

public class Odd_or_Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;

        System.out.println("Enter the number: ");
        number=sc.nextInt();
         if(number%2==0) {
             System.out.println("The number is Even");
         }else{
             System.out.println("The number is Odd");
         }
    }
}
