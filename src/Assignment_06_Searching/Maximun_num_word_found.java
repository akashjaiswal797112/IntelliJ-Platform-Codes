package Assignment_06_Searching;

public class Maximun_num_word_found {

    public static void main(String[] args) {
//Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
//Output: 6
        String[] search = {"alice and bob love leetcode",
                "i think so too",
                "this is great thanks very much"};

        int x=0;
        int maxNum=0;
        for (int i = 0; i < search.length; i++) {
            int count=1;
            //search[0];


            for (int j = 0; j < search[i].length(); j++) {
                //   alice and bob love leetcode"

                if(search[i].charAt(j) == ' ')
                {
                    count++;
                }
            }
            //System.out.println(count);
            maxNum = Math.max(count,maxNum);

        }
        System.out.println(maxNum);





    }

}
