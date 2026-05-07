import java.util.Scanner;

public class Updatebit {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        //oper = 1 :- setbit, oper = 0 :- Clearbit

        int n = 5; // 0101
        int pos = 2; // 0100

        int bitmask = 1 << pos; 

        if (oper == 1) {
            //Set bit
            int newNumber = bitmask | n;
            System.out.println(newNumber);
        } else if (oper == 0) {
            //Clear Bit
            int notBitmask = ~(bitmask);
            int newNumber = notBitmask & n;
            System.out.println(newNumber);
        } else {
            System.out.println("Wrong input! only 0 and 1 input allowed.");
        }
    }
}

/*
    Upadate bit is a combination of setbit and clearbit,
    it will depend on operation value, If the operation value
    is 1 then it will perform setbit, If the operation value is
    0 then it will perform clearbit.
    
*/
