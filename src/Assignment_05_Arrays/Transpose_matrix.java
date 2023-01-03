package Assignment_05_Arrays;

import java.util.Arrays;

public class Transpose_matrix {
    public static void main(String[] args) {
        //Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
        //Output: [[1,4,7],[2,5,8],[3,6,9]]

        int[][] matrix={{1,2,3}, {4,5,6},{7,8,9}};




                int[][] ans = new int[matrix[0].length][matrix.length];
                for(int i=0;i<matrix[0].length;i++)
                {
                    for(int j=0;j<matrix.length;j++)
                    {
                        ans[i][j]=matrix[j][i];
                        System.out.println(ans[i][j]);
                    }
                    System.out.println();
                }
               // return ans;




    }
}

