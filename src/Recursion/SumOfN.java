package Recursion;

public class SumOfN {
    public static void main(String[] args) {
        int num=10;
        System.out.println(fun(num));
    }

    static int fun(int num)
    {
        //base case
        if(num==0)
        {
            return 0;
        }

        //recursive relation
        return num + fun(num-1);

    }
}
