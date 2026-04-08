//7. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pos = 0, neg = 0, zero = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            if (num > 0) 
                pos++;
            else if (num < 0)
                neg++;
            else 
                zero++;
            
            System.out.print("Continue? (y/n): ");
            choice = scanner.next().toLowerCase().charAt(0);
        } while (choice == 'y');

        System.out.printf("Positives: %d, Negatives: %d, Zeros: %d%n", pos, neg, zero);
        
    }
}
