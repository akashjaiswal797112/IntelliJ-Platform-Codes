package Assignment_03;

public class perfect_number {
    public static void main(String[] args) {
        int num=496,sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
            {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
