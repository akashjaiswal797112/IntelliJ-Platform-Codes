package Assignment_06_Searching;

public class Sqrtx {
    public static void main(String[] args) {
        //Input: x = 4
        //Output: 2
        int x=16;
        int ans=mysqrt(x);
        System.out.println(ans);
    }

    private static int mysqrt(int x) {
        return (int) Math.pow(x,0.5);

    }
}
