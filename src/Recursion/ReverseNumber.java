package Recursion;

public class ReverseNumber {
    static int sum = 0;

    public static void main(String[] args) {
        int num = 1234;
        rev(num);
        System.out.println(sum);
    }

    public static void rev(int num) {
        if(num == 0)
        {
            return;
        }
        int last = num%10;
        sum = sum * 10 + last;
        rev(num/10);
    }
}
