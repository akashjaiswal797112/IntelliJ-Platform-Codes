package Topics_DSA;

public class CountOperationsToObtainZero_2169 {

    public static void main(String[] args) {
        int num1 = 0, num2 = 1;
        int count=0;
        int val=0;

//        if(num2>num1)
//        {
//             val=num1;
//        }
//        else
//        {
//            val=num2;
//        }
        while(num2!=0)
        {
            count++;
            if(num1>num2)
            {
                num1=num1-num2;
            }
            else
            {
                num2=num2-num1;
            }
            if (num1==0)
            {
                break;
            }
        }
        System.out.println(count);


    }


}
