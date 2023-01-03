package Recursion;

public class CountingNumbers {
    public static void main(String[] args) {
        int num=50;
        System.out.println(fun(num));
    }

    static int fun(int num)
    {
        //base case
        if(num==0)
        {
            return 0;
        }
        System.out.println(num);
        //recursive relation
            return  fun(num-1);

    }
}


