//Take an array as input from the user. Search for given number x and print the index at which it occurs.

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];
        
        //input
        for(int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        //output
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("X is found at index:- "+ i);
            }
        }
    }
}
