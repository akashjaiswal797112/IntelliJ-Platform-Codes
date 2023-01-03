package Assignment_02;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        char op;
        System.out.println("Enter first number: ");
        num1=sc.nextInt();
        System.out.println("Enter second number: ");
        num2=sc.nextInt();
        System.out.println("Enter Operator: ");
        op=sc.next().charAt(0);

        if(op=='+'){
            System.out.println(num1+num2);
        }else if(op=='-'){
            System.out.println(num1-num2);
        }else if(op=='*'){
            System.out.println(num1*num2);
        }else if(op=='/'){
            System.out.println(num1/num2);
        }else {
            System.out.println("Wrong operator");
        }


    }
}
