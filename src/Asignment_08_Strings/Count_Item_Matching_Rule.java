package Asignment_08_Strings;

import java.util.ArrayList;
import java.util.List;

public class Count_Item_Matching_Rule {
    public static void main(String[] args) {
        //Input: items = [["phone","blue","pixel"],
        //               ["computer","silver","lenovo"],
        //                ["phone","gold","iphone"]],
        //
        //              ruleKey = "color", ruleValue = "silver"
        //Output: 1
        //Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].

        List<List<String>> items = new ArrayList<>();
        ArrayList<String> al1 = new ArrayList<>();
        ArrayList<String> al2 = new ArrayList<>();
        ArrayList<String> al3 = new ArrayList<>();

        al1.add("phone");
        al1.add("blue");
        al1.add("pixel");
        al2.add("computer");
        al2.add("silver");
        al2.add("lenovo");
        al3.add("phone");
        al3.add("gold");
        al3.add("iphone");

        items.add(al1);
        items.add(al2);
        items.add(al3);


        System.out.println(items);

        String ruleKey = "type";
        String ruleValue = "phone";
        int index = 0;
        if(ruleKey.equals("type"))
        {
            index = 0;
        }
        else if(ruleKey.equals("color"))
        {
            index = 1;
        }
        else
        {
            index = 2;
        }

        int count=0;
        for (List<String> list : items) {
            if(list.get(index).equals(ruleValue))
                count++;
        }
        System.out.println(count);


    }
}


//int matchIndex=-1;
//        if(ruleKey.equals("type"))
//            matchIndex=0;
//        else if(ruleKey.equals("color"))
//            matchIndex=1;
//        else
//            matchIndex=2;
//
//        int count=0;
//        for(List<String> list : items){
//            if(list.get(matchIndex).equals(ruleValue))
//                count++;
//        }
//
//    return count;