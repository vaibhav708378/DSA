import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:- ");
        int size = sc.nextInt();

        int numbers[] = new int[size];
        System.out.println("Enter the elements of array:- ");
        
        //input
        for(int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        //output
        for(int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }
}
