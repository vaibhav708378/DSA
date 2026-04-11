import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        //String Concatenation
        Scanner sc = new Scanner(System.in);

        String firstname = sc.next();
        String lastName = sc.next();

        String fullName = firstname + " " + lastName;

        System.out.println("First Name is: "+ firstname);
        System.out.println("Lasst Name is: "+ lastName);

        System.out.println("Full Name Is: "+ fullName);
        System.out.println(fullName.length());
    }
}
