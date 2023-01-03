package Assignment_06_Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection_of_arrays {


    public static void main(String[] args) {

        //[4,9,5]
        //[9,4,9,8,4]
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i]==nums2[j]) {

                    if(!list.contains(nums1[i]))
                        list.add(nums1[i]);
                }
            }
        }
        int[] arr=new int[list.size()];
        for (int z = 0; z < list.size(); z++) {
            arr[z]= list.get(z);
        }
        System.out.println(Arrays.toString(arr));
    }

}
