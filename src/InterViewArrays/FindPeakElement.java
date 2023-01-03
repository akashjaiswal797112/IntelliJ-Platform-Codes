package InterViewArrays;

public class FindPeakElement {
    public static void main(String[] args) {
        //int arr[] = {1, 2, 3, 4, 5, 7, 6, 5, 4, 2, 2, 1, 0};
        int arr[] = {-1,-1,0,1,1,2,3,5,4,3,2,2,1,1,0};
        int ans = findingPeak(arr);
        System.out.println(ans);
    }
    //kunal's solution
//    private static int findingPeak(int[] arr) {
//        int start = 0;
//        int end = arr.length-1;
//        while(start < end)
//        {
//            int mid = start + (end-start)/2;
//             if(arr[mid] > arr[mid+1])
//            {
//                end = mid;
//            }
//            else
//            {
//                start = mid+1;
//            }
//        }
//        return start;
//    }


    //Akash's solution working fine
    private static int findingPeak(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])
            {
                return mid;
            }
            else if(arr[mid] < arr[mid+1])
            {
                start = mid;
            }
            else
            {
                end = mid;
            }
        }
        return -1;
    }



}
