import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        //Compare
        Scanner sc = new Scanner(System.in);

        String name1 = sc.next();
        String name2 = sc.next();

        /* 
        Cases:
            1. string1 > string2 : +ve value
            2. string1 == string2 : 0
            3. string1 < string2 : -ve value
        */

        // if(name1.compareTo(name2) == 0) { //name = str1 and name2 =str2
        //     System.out.println("Strings are Equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

        //Using == sign

        // if(name1 == name2) { 
        //     System.out.println("Strings are Equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

        //Some cases the '==' fails, therefore we used 'compareTo' function.
        //ex:-
        
        if(new String("Vaibhav") == new String("Vaibhav")) { 
            System.out.println("Strings are Equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
