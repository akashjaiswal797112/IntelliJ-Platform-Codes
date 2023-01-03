package Assignment_03;

import java.util.Scanner;

public class subtractProductAndSum {
    static int subtractProductAndSum(int n) {

        int number=n;
        int a=0,prod=1,sum=0;

        while(number!=0){
            a=number%10;
            sum=sum+a;
            prod=prod*a;
            number=number/10;
        }
        System.out.println(prod);
        System.out.println(sum);
        return prod-sum;



    }



    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        System.out.print(subtractProductAndSum(num));
    }

}
