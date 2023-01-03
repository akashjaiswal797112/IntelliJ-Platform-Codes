package Assignment_05_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kids_Candies {
    public static void main(String[] args) {
        //Input: candies = [12,1,12], extraCandies = 10
        //Output:      [true,false,true]
       int extraCandies = 10;
        int[] candies={12,1,13};
//        int large=0;
//        for (int i = 0; i < candies.length; i++) {
//            if(large<candies[i])
//            {
//                large= candies[i];
//            }
//        }
//        Boolean[] arr=new Boolean[candies.length];
//
//        for (int j = 0; j < candies.length; j++) {
//            arr[j]=( candies[j] + extraCandies >= large);
//
//        }
//
//        System.out.println(Arrays.toString(arr));


        int large=0;
        for (int i = 0; i < candies.length; i++) {
            if(large<candies[i])
            {
                large= candies[i];
            }
        }

        List<Boolean> arr = new ArrayList<>();

        for (int j = 0; j < candies.length; j++) {
            arr.add( candies[j] + extraCandies >= large);

        }

        System.out.println(arr);


    }
}
