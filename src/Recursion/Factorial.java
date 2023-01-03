package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    // 1 2 3  4  5
    // 1 2 6 24  120
    static int fact(int num)
    {

        if(num==0)
        {
            return 1;
        }
        else
        {
            return (num*fact(num-1));

        }
    }
}
