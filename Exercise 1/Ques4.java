//4. Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.Scanner;

public class Ques4 {
    public static double circumferenceOfCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();

        double result = circumferenceOfCircle(radius);

        System.out.println("The circumference of circle is: "+ result);
    }
}
