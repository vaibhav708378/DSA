//8. Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of 'x': ");
        double x = sc.nextDouble();

        System.out.println("Enter the value of 'n': ");
        double n = sc.nextDouble();

        double result = Math.pow(x, n);

        System.out.println(x + " raised to the power of "+ n +" is: "+ result);
        
    }
}
