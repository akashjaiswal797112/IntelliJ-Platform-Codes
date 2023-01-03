package InterViewArrays;

public class SearchInfinityArray {
    public static void main(String[] args) {
               //    0  1  2  3  4  5  6  7  8   9   10
        int arr[] = {1, 3, 4, 5, 6, 7, 8, 9, 12, 13, 14, 17, 19, 20, 22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43};
        int target = 8;
      //  System.out.println(findingRange(arr,target));
        int ans = binarySearch(arr,target,1,14);
        System.out.println(ans);

    }

    static int  findingRange(int[] arr, int target)
    {
        int start = 0;
        int end = 1;

        while(target > arr[end])
        {
            //  kunal's technique
            //  int tempStart = end+1;
            //  end = end + (end - start + 1) * 2;
            //  start = tempStart;

            // akash's technique
            int prevStart = start;
            start = end + 1;
            end = (end - prevStart + 1) * 2;
        }
        return binarySearch(arr, target, start, end);
    }

    static int  binarySearch(int arr[], int target, int start, int end)
    {
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
