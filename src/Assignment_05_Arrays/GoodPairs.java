package Assignment_05_Arrays;

public class GoodPairs {
    public static void main(String[] args) {
        //Input: nums = [1,2,3,1,1,3]
        //Output: 4
        //Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

        int[] nums = {1,1,1,1};
        int goodpairs=0,start,ans=0;
        int len=nums.length;
        for (int i = 0 ; i < len ; i++) {
            int count=1;
            for (int j = i+1; j < len; j++) {

                if(nums[i]!=0)
                {
                    if(nums[i]==nums[j])
                    {
                        nums[j]=0;
                        count++;
                    }
                }
            }
                ans+= count * ( count - 1)/2;
        }
        System.out.println(ans);

    }
}
