package Assignment_02;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        int a,b;
        a= scanner.nextInt();
        b= scanner.nextInt();


        if(a > b){
            System.out.println("A is Greater");
        }else {
            System.out.println("B is Greater");
        }


    }
}
