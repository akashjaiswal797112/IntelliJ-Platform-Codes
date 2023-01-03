package Assignment_02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int principal,time,rate;
        principal=sc.nextInt();
        time=sc.nextInt();
        rate=sc.nextInt();

        System.out.println("The simple interest is: "+ principal*rate*time);
    }
}
