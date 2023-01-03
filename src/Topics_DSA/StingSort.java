package Topics_DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StingSort {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("3)Title : Fantastic Beasts, Popularity : 4223.547, Rating : 6.8");
        list.add("2)Title : Sonic mode, Popularity : 3523.547, Rating : 7.8");
        list.add("1)Title : Lost City, Popularity : 4223.547, Rating : 6.9");
        list.add("5)Title : Memory, Popularity : 3028.547, Rating : 7.3");
        list.add("4)Title : Doctor Strange, Popularity : 2723.547, Rating : 7.1");

        String[] arr = new String[list.size()];


        for (int i = 0; i < list.size(); i++)

            arr[i] = list.get(i);



    boolean swapped=false;

        double ratingOfI;
        double ratingOfIless;

  for (int i = 0; i < arr.length-1; i++) {
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length; j++) {
                //swap if the current item is smaller than the previous item.

                String str=arr[j];
                String a = "";
                for (int l = str.length()-3; l < str.length(); l++) {
                    a = a + String.valueOf(str.charAt(l));
                }
                ratingOfI = Double.parseDouble(a);


                String str2=arr[j-1];
                String b = "";
                for (int k = str2.length()-3; k < str2.length(); k++) {
                    b = b + String.valueOf(str2.charAt(k));
                }
                ratingOfIless = Double.parseDouble(b);

                if (ratingOfIless > ratingOfI) {
                    String temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
            {
                break;
            }

        }

        for (int last = 0; last < arr.length; last++) {
            System.out.println((arr[last]));

        }





    }


}
