package Assignment_04;

public class Palindrome_funtion {


    public static void main(String[] args) {
        int num=151;
        System.out.println(check(num));
    }

    private static String check(int num) {

        int x=num,sum=0;
        while(x!=0)
        {
            int a=x%10;
            sum=sum*10+a;
            x=x/10;
        }
        if(sum==num)
        return  "palindrome";
        else
            return "not a palindrome";
    }
}
