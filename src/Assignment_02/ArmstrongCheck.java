package Assignment_02;

import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=153,a,b,sum=0;
       int temp=num;
        // 153 = 1*1*1 + 5*5*5 + 3*3*3 // 153
        while(num!=0)
        {
             a=num%10;      //3    5
             b=a*a*a;       //27   125
             sum=sum+b;  //27
            num=num/10;
        }

        if(sum==temp){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong");
        }


    }
}
