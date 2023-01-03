package Assignment_06_Searching;

import static java.lang.System.exit;

public class Valid_perfect_square {

    //1 way
    public static void main(String[] args) {
        int num=14,countif=0;
        for (int i = 1; i < num/2; i++) {
            if(i*i==num)
                countif=1;
        }

        if(countif==1)
            System.out.println("true");
        else
            System.out.println("false");
    }

        // 2nd way
//    public static void main(String[] args) {
//        int num = 4;
//        int start = 0;
//        int end = num;
//// 0 1 2 3 4 5 6 7 8 9
//        while(start <= end)
//        {
//            int mid = start + (end-start)/2;
//            int ans= mid*mid;
//
//            if(ans==num)
//            {
//                System.out.println("true");
//                exit(0);
//            }
//            else if(ans > num)
//            {
//                end= mid-1;
//            }
//            else
//            {
//                start = mid+1;
//            }
//        }
//        System.out.println("false");
//
//
//    }


}


