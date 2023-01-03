package InterViewArrays;

public class SearchInMountainArray {
    public static void main(String[] args) {
        //{1,2,3,4,5,3,1} target = 3  ans = 2 //returning index;


        int arr[] = {0,2,1,0};
        int peak = findingPeak(arr);
        System.out.println(peak);
        int target = 3;
        int start = 0;
        int end = peak;
        char operator = '<';
        int left = binarySearching(arr,target,start,end,operator);
        if(left != -1)
        {
            System.out.println(left);
        }
        else
        {
            operator = '>';
            start = peak+1;
            end = arr.length-1;
            int right = binarySearching(arr,target,start,end,operator);
            System.out.println(right);
        }
    }
    private static int binarySearching(int[] arr, int target, int start, int end,char operator) {
        while(start <= end)
        {
            int mid = start + (end-start)/2;

            if(target == arr[mid])
            {
                return mid;
            }

            if(operator == '<')
            {
                if(arr[mid] < target)
                {
                    start = mid+1;
                }
                else
                {
                    end = mid-1;
                }
            }
            else
            {
                if(arr[mid] > target)
                {
                    start = mid+1;
                }
                else
                {
                    end = mid-1;
                }
            }


        }

        return -1;
    }

    private static int findingPeak(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end)
        {
            int mid = start + (end-start)/2;

            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1])
            {
                return mid;
            }
            else if(arr[mid] > arr[mid-1])
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
