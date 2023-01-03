package Asignment_08_Strings;

public class String_Half_Alike {
    public static void main(String[] args) {
        String s = "textbook";
         int count1 = 0;
         int count2 = 0;

        for (int a = 0; a < s.length()/2; a++) {



            switch (s.charAt(a))
            {

                case 'a', 'e', 'i', 'o', 'u':
                case 'A', 'E', 'I', 'O', 'U':
                    count1++;

            }
        }



            for (int b = s.length()/2; b < s.length(); b++) {
                switch(s.charAt(b))
                {
                    case 'a', 'e', 'i', 'o', 'u':
                    case 'A', 'E', 'I', 'O', 'U':
                        count2++;
                }
        }

        System.out.println(count1);
        System.out.println(count2);

    }
}
