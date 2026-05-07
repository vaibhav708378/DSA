public class Setbit {

    public static void main(String[] args) {
        int n = 5; // 0101
        int pos = 1;

        int bitmask = 1 << pos;

        int newNumber = bitmask | n; // if the number is 0 at the pos 1 then it will convert it into 1.
        System.out.println(newNumber);
    }
}

// if the number is 0 at the pos 1 then it will convert it into 1.
// If the number is alredy 1 at given pos then the number not changed to 0.

