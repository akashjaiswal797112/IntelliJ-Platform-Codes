package Assignment_03;

import java.util.Scanner;

public class operation_from_a_list {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=0,negativeSum=0,evenSum=0,oddSum=0;

        while((input=sc.nextInt())!=0){
            if(input<0)
            {
                negativeSum+=input;
            }
            else if(input%2==0)
            {
                evenSum+=input;
            }
            else if(input%2!=0){
                oddSum+=input;
            }
            else{
                System.out.println("error");
            }

        }
        System.out.println(negativeSum);
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}
