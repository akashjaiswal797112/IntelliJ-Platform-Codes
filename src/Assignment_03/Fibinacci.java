package Assignment_03;

import java.util.Scanner;

public class Fibinacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=0;
        int b=1;
        int c=0;
        int num;
        System.out.println("enter no.");
        num=sc.nextInt();
        System.out.print(a+""+"  "+b);
        int i=1;
        while(i<num)
        {
            c=a+b;
            System.out.print("   "+c);
            a=b;
            b=c;
            i++;

        }
    }

}
