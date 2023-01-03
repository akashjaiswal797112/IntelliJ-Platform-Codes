package Assignment_03;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int no=0,tot=0;
        for(int i=1;i<=num;i++){
            no=sc.nextInt();
            tot=tot+no;
        }
        System.out.println(tot/2);
    }
}
