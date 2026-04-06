//2. Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

public class Ques2 {
    public static void printsumofOdd(int n) {
        int sum = 0;

        for(int i = 1; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("The sum of odd numbers from 1 to "+ n + " is:"+ sum);
    }

    public static void main(String[] args) {
        printsumofOdd(10);
    }
}
