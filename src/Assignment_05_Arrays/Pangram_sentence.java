package Assignment_05_Arrays;

public class Pangram_sentence {
    public static void main(String[] args) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";


        String sentence = "thequickbrownfoxjumpsoverthelazydog";



        char[] alphaArray=alphabet.toCharArray();
        char[] sentArray=sentence.toCharArray();

        int count=0;
        for (int i = 0; i < alphaArray.length; i++) {

            for (int j = 0; j < sentArray.length; j++) {



                if (sentArray[j]==alphaArray[i]) {
                    count++;
                    break;

                }

            }
        }
        System.out.println(count);
        if(count==26)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }


    }

}
