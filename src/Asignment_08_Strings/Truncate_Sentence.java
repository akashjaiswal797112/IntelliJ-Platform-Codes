package Asignment_08_Strings;

public class Truncate_Sentence {
    public static void main(String[] args) {
        //Input: s = "Hello how are you Contestant", k = 4
        //Output: "Hello how are you"

        String s = "Hello how are you Contestant jais";
        int k=4;
        int count=0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i)==' ')
            {
                count++;
            }
            if(count==k)
            {
                break;
            }
                else {
                builder.append(s.charAt(i));
            }

        }
        System.out.println(builder);
    }
}
