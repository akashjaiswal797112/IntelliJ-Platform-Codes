package Assignment_05_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Count_Items_Matching_a_rule {
    public static void main(String[] args) {
        //[["phone","blue","pixel"],
        // ["computer","silver","lenovo"],
        // ["phone","gold","iphone"]]
        //  ruleKey = "color", ruleValue = "silver"


        int count = 0, num;
        String ruleKey = "name";
        String ruleValue = "iphone";


        String[][] items = {{"phone", "blue", "pixel"},          // 00  01  02
                {"computer", "silver", "lenovo"},    // 10  11  12
                {"phone", "gold", "iphone"}};        // 20  21  22

        ArrayList<ArrayList<ArrayList<String>>> list = new ArrayList<>();

        for (int i = 0; i < items.length; i++) {
            list.add(new ArrayList<ArrayList<String>>(items.length));
            for (int j = 0; j < items.length; j++) {
                list.get(i).add(new ArrayList<String>(items.length));
            }
        }

        System.out.println(list.get(0).get(0));

    }

}