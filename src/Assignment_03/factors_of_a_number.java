package Assignment_03;

public class factors_of_a_number {
    public static void main(String[] args) {

        int num = 100,count=0,i;
        for(i=1;i<=num;i++){
            if(num%i==0)
            {
                System.out.println(i + " ");
            }

        }

    }
}
