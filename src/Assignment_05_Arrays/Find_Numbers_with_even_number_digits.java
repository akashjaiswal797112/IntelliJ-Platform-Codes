package Assignment_05_Arrays;

public class Find_Numbers_with_even_number_digits {
    public static void main(String[] args) {
        // [12,345,2,6,7896]
        //Output: 2


        int[] nums={12,345,2,6,7896};
        String str="";
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            str = String.valueOf(nums[i]);
            if (str.length() % 2 == 0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
