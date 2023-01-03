package Assignment_05_Arrays;

import java.util.Arrays;

public class Shuffle_array {
    public static void main(String[] args) {
        //Input: nums = [2,5,1,3,4,7], n = 3
        //Output:       [2,3,5,4,1,7]

       int[] nums = {1, 2, 3, 1, 2, 3};
       int n = 3;
       int[] arr = new int[nums.length];
        int j=0;
        for (int i = 0; i < n; i++) {

                arr[j]=nums[i];
                arr[j+1]=nums[i+n];
                j=j+2;

        }

        System.out.println(Arrays.toString(arr));

    }
}
