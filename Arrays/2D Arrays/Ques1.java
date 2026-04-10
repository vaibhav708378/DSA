/* Take a matrix as input from the user. search for a given
number x and print the indices at which it occurs. */

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int number[][] = new int[rows][columns];

        //input
        //rows
        for(int i = 0; i < rows; i++) {
            //columns
            for(int j = 0; j < columns; j++) {
                number[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        //output
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                //compare with x
                if(number[i][j] == x) {
                    System.out.println("x found at index ("+ i +", " + j +")");
                }
            }
        }
    }
}
