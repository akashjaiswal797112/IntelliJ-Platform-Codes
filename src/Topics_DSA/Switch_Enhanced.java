package Topics_DSA;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch_Enhanced {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        switch (num) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            case 3 -> System.out.println("three");
            default -> System.out.println("default");
        }


    }
}
