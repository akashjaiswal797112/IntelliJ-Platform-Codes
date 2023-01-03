package Asignment_08_Strings;

public class Defanging_IP_Address {

    public static void main(String[] args) {
        //Input: address = "1.1.1.1"
        //Output: "1[.]1[.]1[.]1"

        String address = "255.100.50.0";

        System.out.println(address.replace(".","[.]"));







        //METHOD 2
//        String address = "255.100.50.0";
//        StringBuilder builder = new StringBuilder();
//
//        for (int i = 0; i < address.length(); i++) {
//
//            if(address.charAt(i)=='.')
//            {
//                builder.append("[.]");
//            }
//            else
//            {
//                builder.append(address.charAt(i));
//            }
//        }
//        System.out.println(builder.toString());

    }
}
