package Assignment_04;

import java.util.Scanner;

public class max_min {

    static int max(int x,int y,int z)
    {
        int a,b,c;
        a=x;
        b=y;
        c=z;

        if(a>b)
        {
            return a;
        }
        else if(c>a)
        {
            return c;
        }
        else{
            return b;
        }
    }

    static int min(int x,int y,int z)
    {
        int aa,bb,cc;
        aa=x;
        bb=y;
        cc=z;

        if(aa<bb)
        {
            return aa;
        }
        else if(cc>aa)
        {
            return cc;
        }
        else{
            return bb;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,num3;
         num1=sc.nextInt();
         num2=sc.nextInt();
         num3=sc.nextInt();



        System.out.println("maximum is : " +max(num1,num2,num3));
        System.out.println("minimum is : " +min(num1,num2,num3));



    }
}
