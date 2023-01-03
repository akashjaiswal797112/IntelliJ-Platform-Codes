package Recursion;

public class nTo1 {
    public static void main(String[] args) {
        fun(5);
    }

    public static void fun(int num)
    {
        if (num == 0)
        {
            return ;
        }
        else
        {
            System.out.println(num);
              fun(num-1 );
        }
    }

}
