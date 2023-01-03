package Assignment_02;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a,b,c,num,i=2;
        a = 0;
        b = 1;
        System.out.println("Enter: ");
        num=sc.nextInt();

        System.out.println("0\n1");
        while(i<num)// 0 1 1 2 3 5 8
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            i++;
        }










        }

    }

