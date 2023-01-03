package Assignment_04;

import java.util.Scanner;

public class voting {

    static String vote(int age)
    {
        if (age>18)
            return "Eligible";
        else
            return "Not Eligible";
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(vote(num));
    }
}
