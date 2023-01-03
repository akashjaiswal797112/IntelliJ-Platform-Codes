package Topics_DSA;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={1,3,5,4,2};

        for (int i = 0; i < arr.length; i++) {

            int last = arr.length-i-1;
            int max = funMax(arr);
            arr[last]=max;
        }
        System.out.println(Arrays.toString(arr));


    }

    private static int funMax(int[] myarray) {
        int max=myarray[0];

        for (int j = 0; j < myarray.length; j++) {
            if(max < myarray[j])
            {
                max = myarray[j];
            }
        }
        return max;
    }
}
