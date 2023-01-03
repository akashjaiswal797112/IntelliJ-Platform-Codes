package Assignment_04;

import java.util.Scanner;

public class Prime_between_two {

    static void check(int num)
    {
        int count=0;
        for(int x=1;x<=num;x++){
            if(num%x==0){
                count++;
            }
        }
        if(count==2) {
            System.out.println(num);
        }

    }

    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b= sc.nextInt();
        for(int i=a;i<=b;i++){
            check(i);
        }
    }
}
