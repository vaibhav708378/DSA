import java.util.Scanner;

public class Function3 {
    public static int Multiplication(int a, int b) {
        int multiply = a*b;
        return multiply;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int multiply = Multiplication(a, b);
        System.out.println("Product of 2 numbers is: "+ multiply);
    }
}
