package Topics_DSA;

public class Patterns {
    public static void main(String[] args) {
        Pattern4(5);
    }


    static void Pattern1(int num){
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern2(int num){
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void Pattern3(int num){
        for (int i = 1; i <= num; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    static void Pattern4(int num){
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {

                System.out.print(col+" ");
            }
            System.out.println();
        }
    }



}
