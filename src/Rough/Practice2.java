package Rough;

import java.util.Stack;

public class Practice2 {
    public static void main(String[] args) {
          //int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
            int arr[] = {1, 3, 4, 5, 6, 7, 8, 9, 12, 13, 14, 17, 19, 20, 22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43};
            int target = 8;
            int start = 0;
            int end = 1;

        while(target > arr[end])
        {
            int prevStart = start;
            start = end + 1;
            end = (end - prevStart + 1) * 2;
        }
        int ans = fun(arr, target, start, end);
        System.out.println(ans);
    }

    private static int fun(int[] arr, int target,int start, int end) {

        while(start <= end)
        {
            int mid = start + (end-start)/2;
            if(target == arr[mid])
            {
                return mid;
            }
            if(target < arr[mid])
                end = mid-1;
            else
                start = mid+1;
        }
        return -1;
    }
}
