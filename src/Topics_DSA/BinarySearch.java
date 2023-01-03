package Topics_DSA;

public class BinarySearch {
    public static void main(String[] args) {
        //int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int target = 2;
        int ans = fun(arr, target);
        System.out.println(ans);
    }

    private static int fun(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean isAsc =arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid])
                    end =mid-1;
                else
                    start=mid+1;
            }
            //if descending
            else{
                if(target > arr[mid])
                    end =mid-1;
                else
                    start=mid+1;
            }
        }
      return -1;

    }

}
