// Q2. print Number From 1 to 5

public class Recursion2 {

    public static void printNumbers(int n) {

        if (n == 6) {
            return;
        }

        System.out.println(n);
        printNumbers(n + 1);
    }

    public static void main(String[] args) {
        int n = 1;
        printNumbers(n);
    }
    
}
