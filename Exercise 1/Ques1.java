//1. Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class Ques1 {
    public static void printAverage(double n1, double n2, double n3) {
        double avg = (n1 + n2 + n3) / 3;
        System.out.println("The average is: "+ avg);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        printAverage(num1, num2, num3);
    }
}