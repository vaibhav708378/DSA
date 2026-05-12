// Q7. print x^n (STack height = logn).

import java.util.Scanner;

public class Recursion7 {

    public static int calcPow(int x, int n) {

        if (n == 0) { //Base case 1
            return 1;
        }
        if (x == 0) {// Base case 2
            return 0;
        }

        //n is even
        if (n % 2 == 0) {
            return calcPow(x, n/2) * calcPow(x, n/2);
        } else { //n is odd
            return calcPow(x, n/2) * calcPow(x, n/2) * x;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value of x: ");
        int x = sc.nextInt();

        System.out.println("Enter the Value of n: ");
        int n = sc.nextInt();

        int ans = calcPow(x, n);
        System.out.println("The "+x+ " to the Power "+ n + " is: " + ans);
    }
    
}
