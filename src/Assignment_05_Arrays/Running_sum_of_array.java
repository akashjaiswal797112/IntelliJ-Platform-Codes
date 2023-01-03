package Assignment_05_Arrays;

import java.util.Arrays;

public class Running_sum_of_array {
    public static void main(String[] args) {
      //  Input: nums = [1,2,3,4]
        // Output: [1,3,6,10]
       int[] nums = {1,2,3,4};
        int[] arr=new int[nums.length];
                int x=0;
        for (int i = 0; i < nums.length ; i++) {

             x=x+nums[i];
             arr[i]=x;


        }
        System.out.println(Arrays.toString(arr));
    }
}
