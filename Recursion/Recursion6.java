//Q6. Print x^n (Stack height = n).

import java.util.Scanner;

public class Recursion6 {
    
    public static int calcPow(int x, int n) {

        if (n == 0) { // Base Case 1
            return 1;
        }
        if (x == 0) { // Base Case 2
            return 0;
        }

        int xPownm1 = calcPow(x, n - 1);
        int xPown = x * xPownm1;
        return xPown;
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
