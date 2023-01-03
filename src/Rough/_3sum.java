package Rough;

import java.util.ArrayList;
import java.util.List;

public class _3sum {

    public static void main(String[] args) {


        int[] nums={-1,0,1,-2,0,2,4,0,-4};
        List<Integer> li = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();


        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){

                    if(i != j && i!= k && j != k){

                        if(nums[i]+nums[j]+nums[k] == 0)
                        {
                            li.add(nums[i]);
                            li.add(nums[j]);
                            li.add(nums[k]);
                        }
                    }
                }
            }
        }

        System.out.println(li);
        System.out.println(list);
    }
}
