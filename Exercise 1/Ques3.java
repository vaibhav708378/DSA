//3. Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class Ques3 {
    public static void geatestNumber(int n1,int n2) {
        if(n1 > n2) {
            System.out.println(n1 + " is greater than "+ n2);
        } else if (n2 > n1) {
            System.out.println(n2 + " is greater than "+ n1);
        } else {
            System.out.println("both are equal");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        geatestNumber(n1, n2);
    }
}
