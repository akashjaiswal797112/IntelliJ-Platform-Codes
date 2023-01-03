package InterViewArrays;

public class CeilingLetters {


    public static void main(String[] args) {

        char[] letters={'c', 'i', 'j', 'l'};
        char target='z';
        char result = nextGreatestLetter(letters,target);
        System.out.println("The equal or largest number is : "+result);
    }
    private static char nextGreatestLetter(char[] letters, char target) {
        int start=0,a=0;
        int end= letters.length-1;

            while(start <= end)
            {
                int mid= start + (end-start)/2;

                if(target < letters[mid])
                    end=mid-1;
                else
                    start=mid+1;
            }

        return letters[start % letters.length ];
    }

}
