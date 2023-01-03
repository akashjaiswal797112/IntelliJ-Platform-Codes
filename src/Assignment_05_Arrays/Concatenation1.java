package Assignment_05_Arrays;

import java.util.Arrays;

public class Concatenation1 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int[] arr=new int[nums.length*2];

        int i;
        for ( i = 0; i < nums.length; i++) {
            arr[i+ nums.length]= arr[i]=nums[i];




        }
        System.out.println(Arrays.toString(arr));


    }
}
