package Topics_DSA;

import java.util.Arrays;

public class SortAscending {
    public static void main(String[] args) {

        int[] nums={1, 3, 5, 4, 2};
        boolean swapped=false;
        //iterate the outer loop

        for (int i = 0; i < nums.length; i++) {
            // for each step, max item will come at the last respective index
            for (int j = 1; j < nums.length; j++) {
                //swap if the current item is smaller than the previous item.
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swapped = true;
                }
            }

            //if you did not swap for the particular element then break the loop
            // as it indicated that the given array is sorted. so as to save memory the loop is breaked.
            if(!swapped)
            {
                break;
            }

        }


        System.out.println(Arrays.toString(nums));



    }
}
