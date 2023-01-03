package Assignment_05_Arrays;

import java.util.Arrays;

public class Flipping_An_Image {
    public static void main(String[] args) {
        //Input: image = [[1,1,0],[1,0,1],[0,0,0]]
        //Output:        [[1,0,0],[0,1,0],[1,1,1]]
        //Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
        //Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]

        int[][] image= {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] arr=new int[image.length][image.length];

        for (int i = 0; i < image.length; i++) {
            int k= image.length-1;
            for (int j = 0; j < image.length; j++,k--) {

                if(image[i][k]==1)
                {

                    arr[i][j]=0;
                }
                else
                {
                    arr[i][j]=1;
                }
               // System.out.println("inserting : "+ arr[i][j]);

            }
        }

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                System.out.print(arr[i][j]);
            }
        }

    }
}
