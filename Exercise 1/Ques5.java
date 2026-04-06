//5. Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.Scanner;

public class Ques5 {
    public static void eligibilityCheck(int age) {
        if(age <= 18) {
            System.out.println("The person is not eligible to Vote");
        } else if(age > 18) {
            System.out.println("The person is eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        eligibilityCheck(age);
    }
}
