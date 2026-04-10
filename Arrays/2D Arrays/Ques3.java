// For a given matrix of N x M, print its transpose.

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[n][m] = sc.nextInt();
            }
        }

        System.out.println("Transpose of matrix is:- ");

        for(int j = 0; j < m; j++) {
            for(int i = 0; i < n; i++) {
                System.out.print(matrix[j][i]+ " ");
            }
            System.out.println();
        }
    }
}
