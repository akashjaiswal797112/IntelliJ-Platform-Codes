package Recursion;
//2^3=8

public class NumberToPowerN {
    public static void main(String[] args) {
        System.out.println(fun(3));
    }
    static int fun(int num) {
        //base case
        if (num == 0)
        {
            return 1;
        }

        //recursive solution
        return 2*fun(num-1);
    }
}
