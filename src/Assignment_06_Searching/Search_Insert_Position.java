package Assignment_06_Searching;

import static java.lang.System.exit;

public class Search_Insert_Position {

    public static void main(String[] args) {

        int[] nums = {2,3,4,7,8,9};
        int target=11;
        int len = nums.length;
        int x = len-1;

                if(target > nums[len-1]) {
                    System.out.println(len);
                }


                else{
                    for (int i = 0; i < nums.length; i++) {
                        if(target<=nums[i]) {
                            System.out.println("the element should be inserted at position is: "+i);
                            exit(0);
                        }
                    }
                }

    }

}
