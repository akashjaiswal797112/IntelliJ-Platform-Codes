package Assignment_05_Arrays;

public class Matrix_diagonal_sum {
    public static void main(String[] args) {

        int[][] arr={{1, 1, 1, 1},  //      00  01  02  03   i==j,  i-j==2  i-j==-2
                     {1, 1, 1, 1},  //      10  11  12  13
                     {1, 1, 1, 1},  //   20  21  22  23
                     {1, 1, 1, 1}}; //  30  31  32  33

        int [][] arr2={{1,2,3},{4,5,6},{7,8,9}};

        int len=arr.length-1;
                int count=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if( (i==j)  || i+j==len)  //(i==x) && (j==y)
                {
                    count=count+arr[i][j];
                    System.out.println(arr[i][j]);
                }

            }

        }

        System.out.println(count);


    }
}
