import java.util.Scanner;

public class pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        //Outer loop
        for(int i = 1; i <= n; i++) {
            //inner loop
            for(int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}