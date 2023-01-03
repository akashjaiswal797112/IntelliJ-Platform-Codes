package Asignment_08_Strings;

public class GoalParser {
    public static void main(String[] args) {
        //Input: command = "G()(al)"
        //Output: "Goal"

        String command = "G()(al)";

//       String a = command.replace("()","o");
//       String last =  a.replace("(al)","al");
//
//        System.out.println(last);

        System.out.println(command.replace("()","o").replace("(al)","al"));
    }
}
