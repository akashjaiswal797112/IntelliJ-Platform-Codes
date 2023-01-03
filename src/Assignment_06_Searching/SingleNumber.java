package Assignment_06_Searching;

public class SingleNumber {
    public static void main(String[] args) {
        //Input: nums = [4,1,2,1,2]
        //Output: 4

        int[] nums={4,2,2,1,1};

        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            ans =ans^nums[i];
            System.out.println(ans);
        }
        System.out.println();

        System.out.println(ans);


         }

    }

