import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // if (age > 18) {
        //     System.out.println("Adult");
        // } else {
        //     System.out.println("Minor");
        // }

        // int x = sc.nextInt();

        // if ( x % 2 == 0) {
        //     System.out.println("Even");
        // } else {
        //     System.out.println("Odd");
        // }/

        // int x = sc.nextInt();
        // int y = sc.nextInt();

        // if (x == y) {
        //     System.out.println("Equal");
        // } else if (x > y) {
        //     System.out.println("X is Greater than y");
        // } else {
        //     System.out.println("Y is Greater than X");
        // }

        int button = sc.nextInt();

        if (button == 1) {
            System.out.println("Hello");
        } else if (button == 2) {
            System.out.println("Namste");
        } else if (button == 3) {
            System.out.println("Bonjor");
        } else {
            System.out.println("Wrong button");
        }

    }
}
