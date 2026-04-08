//9. Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)

import java.util.Scanner;

public class Ques9 {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();

        System.out.println("The GCD is: "+ findGCD(n1, n2));
    }
}
