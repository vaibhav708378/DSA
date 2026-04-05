import java.util.Scanner;

public class Function6 {
    public static void printtable(int n) {
        //loop
        for(int i = 1; i <= 10; i++) {
            System.out.println(n*i);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printtable(n);
    }
}
