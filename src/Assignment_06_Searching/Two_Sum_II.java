package Assignment_06_Searching;

public class Two_Sum_II {

    public static void main(String[] args) {
//Input: numbers = [2,7,11,15], target = 9
//Output: [1,2]
//Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] ans = fun(arr, target);
        System.out.println(ans);
    }


        public static int[] fun(int[] numbers, int target) {

            int[] output = new int[2];
            int start = 0;
            int end = numbers.length - 1;
            int sum;

            while(start < end)
            {
                // Add first and last number together
                sum = numbers[start] + numbers[end];

                // If matches target
                if(sum == target)
                {
                    // Update output and breat
                    output[0] = start+1;
                    output[1] = end+1;
                    break;
                }
                // If less than target
                else if(sum < target)
                {
                    // Increase starting index
                    start++;
                }
                // If higher than target
                else if(sum > target)
                {
                    // Decrease ending index
                    end--;
                }
            }

            return output;

        }


}
