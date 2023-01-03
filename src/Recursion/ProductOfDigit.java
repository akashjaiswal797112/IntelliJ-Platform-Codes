package Recursion;

public class ProductOfDigit {
    public static void main(String[] args) {
        int num = 202;
        System.out.println(prod(num));
    }

    public static int prod(int num) {
        if(num == 0)
        {
            return 1;
        }
        return num%10 * prod(num/10);
    }
}
