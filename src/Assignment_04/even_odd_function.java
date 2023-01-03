package Assignment_04;

import java.util.Scanner;

public class even_odd_function {

    static String check(int a)
    {
        if(a%2==0)
        {
            String str="even";
            return str;

        }
        else
            return "Odd";
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(check(num));

    }
}
