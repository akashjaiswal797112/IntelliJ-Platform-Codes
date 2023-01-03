package Assignment_04;

public class prime_or_not {
    static String check(int num)
    {
        int count=0;
        for (int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count==2)
        return "prime";
        else
            return "Not a Prime";
    }

    public static void main(String[] args) {
        int num=7;
        System.out.println(check(num));
    }
}
