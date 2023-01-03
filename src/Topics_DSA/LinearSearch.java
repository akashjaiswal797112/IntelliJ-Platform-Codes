package Topics_DSA;

public class LinearSearch {
    public static void main(String[] args) {
        int[]  arr = {1,3,10,2,5,4,6,8,7,9};
        int target= 11;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(target==arr[i])
            {
                System.out.println(i);
            }
            else {
                count++;
            }

            if(count==arr.length)
            {
                System.out.println("not found");
            }
        }
    }
}
