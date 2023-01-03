package Topics_DSA;

public class StepsToReduce_1342 {

    public static void main(String[] args) {
        //Input: num = 14
        //Output: 6
        //Explanation:
        //Step 1) 14 is even; divide by 2 and obtain 7.
        //Step 2) 7 is odd; subtract 1 and obtain 6.
        //Step 3) 6 is even; divide by 2 and obtain 3.
        //Step 4) 3 is odd; subtract 1 and obtain 2.
        //Step 5) 2 is even; divide by 2 and obtain 1.
        //Step 6) 1 is odd; subtract 1 and obtain 0.




//
//        int num = 14;
//        int count=0;
//        while(num!=0)
//        {
//            count++;
//            if(num%2==0)
//            {
//                num = num/2;
//            }
//            else
//            {
//                num = num-1;
//            }
//        }
//        System.out.println(count);

        int count=0;
        System.out.println(fun(123,count));

    }

     static int fun(int num,int count) {
        if(num==0)
        {
            return count;
        }
        else
        {
            count++;
            if(num%2==0)
            {
                return fun(num/2,count);
            }
            else
            {
                return fun(num-1,count);
            }
        }
    }
}
