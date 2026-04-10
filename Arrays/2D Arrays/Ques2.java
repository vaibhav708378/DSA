/* Print the spiral order matrix as output for a given matrix of numbers.  */

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];

        //input
        for(int i = 0; i< n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[n][m] = sc.nextInt();
            }
        }

        System.out.println("The spiralorder of matrix is :- ");

        int row_start = 0;
        int row_End = n - 1;

        int col_start = 0;
        int col_End = m - 1;

        //To print the spiral order of matrix :-
        while (row_start <= row_End && col_start <= col_End) {
            //1
            for(int col = col_start; col <= col_End; col++) {
                System.out.print(matrix[row_start][col]);
            }
            row_start++;

            //2
            for(int row = row_start; row <= row_End; row++) {
                System.out.print(matrix[row][col_End]);
            }
            col_End--;

            //3
            for(int col = col_End; col >= col_start; col--) {
                System.out.print(matrix[row_End][col]);
            }
            row_End--;

            //4
            for(int row = row_End; row >= row_start; row--) {
                System.out.print(matrix[row][col_start]);
            }
            col_start++;

            System.out.println();
        }
    }
}
