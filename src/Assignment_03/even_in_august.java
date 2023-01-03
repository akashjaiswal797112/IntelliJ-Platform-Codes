package Assignment_03;

public class even_in_august {
    public static void main(String[] args) {
        int aug=31;
        int count=0;
        int i=1;
        for(i=1;i<=aug;i++)
        {
            if(i%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
