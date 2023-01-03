package InterViewArrays;

import static java.lang.System.exit;

public class CeilingOfNumber {
    public static void main(String[] args) {

        int[] arr={2,3,5,9,14,16,18};
        int target=19;
        int result = funBinary(arr,target);
        System.out.println("The equal or largest number is : "+result);
    }
    private static int funBinary(int[] arr, int target) {
        int start=0;
        int end= arr.length-1;
        int mid=0;
        if(target <= arr[end])
        {
            while(start <= end)
            {
                mid= start + (end-start)/2;
                if(arr[mid]==target)
                    return arr[mid];
                if(target < arr[mid])
                    end=mid-1;
                else
                    start=mid+1;
            }
        }
        else
        {
            return -1;
        }
        return arr[start];
    }
}
