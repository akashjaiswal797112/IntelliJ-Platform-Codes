package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
    static  int fibo(int num)
    {
        // 0 1 2 3 5 8 13 21
        if(num<2)
        {
            return num;
        }
        else
        {
            return (num=fibo(num-1)+fibo(num-2));
        }
    }
}
