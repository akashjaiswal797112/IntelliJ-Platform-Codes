package Assignment_05_Arrays;

import java.util.Arrays;

public class Cells_with_odd_values {
    public static void main(String[] args) {

//Input: m = 2, n = 3, indices = [[0,1],[1,1]]
//Output: 6
//Explanation: Initial matrix = [[0,0,0],[0,0,0]].
        
        int m=2,n=3;
        int[][] arr =new int[m][n];
        int len=m*n;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=0;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(arr[i][j]);
            }
        }
        
    }
}
