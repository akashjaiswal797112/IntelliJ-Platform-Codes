package Assignment_05_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Create_Targer_Array {
    public static void main(String[] args) {





        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }


        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        System.out.println(Arrays.toString(ans));

    }
}
