package Assignment_03;

import java.util.Scanner;

public class vowel_consonant {
    public static void main(String[] args) {
        char a;
        Scanner sc=new Scanner(System.in);
           a=sc.next().charAt(0);
        switch (a) {
            case 'a' -> System.out.println("vowel");
            case 'e' -> System.out.println("vowel");
            case 'i' -> System.out.println("vowel");
            case 'o' -> System.out.println("vowel");
            case 'u' -> System.out.println("vowel");
            case 'A' -> System.out.println("vowel");
            case 'E' -> System.out.println("vowel");
            case 'I' -> System.out.println("vowel");
            case 'O' -> System.out.println("vowel");
            case 'U' -> System.out.println("vowel");

            default -> System.out.println("consonant");
        }

    }
}
