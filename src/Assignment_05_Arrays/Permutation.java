package Assignment_05_Arrays;

import java.util.Scanner;

public class Permutation {
    /*
    Input: nums = [0,2,1,5,3,4]
    Output: [0,1,2,4,5,3]
    Explanation: The array ans is built as follows:
    ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3]
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];

        for (int i = 0; i < 6; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i <6 ; i++) {
            System.out.println(arr[arr[i]]);
        }

    }

}
