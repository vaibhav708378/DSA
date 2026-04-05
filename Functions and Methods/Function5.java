import java.util.Scanner;

public class Function5 {
    public static void EvenOrOdd(int n){
        if(n % 2 == 0) {
            System.out.println(n + " is Even number");
        } else {
            System.out.println(n + " is Odd number");
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        EvenOrOdd(n);
    }
}
