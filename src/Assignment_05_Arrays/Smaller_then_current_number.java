package Assignment_05_Arrays;

import java.util.Arrays;

public class Smaller_then_current_number {
    public static void main(String[] args) {
        //Input: nums = [8,1,2,2,3]
        //Output: [4,0,1,1,3]

      int[]  nums = {8,1,2,2,3};
      int len=nums.length;

      int[] arr=new int[nums.length];

        for (int i = 0; i < len; i++) {
            int count=0;
            for (int j = 0; j < len; j++) {

                if(nums[i]>nums[j])
                {
                    count++;
                }
            }
           arr[i]=count;

        }

        System.out.println(Arrays.toString(arr));



    }
}
