// Q4. Find the number of ways inn which you can invite n peoples to your party, single or in pair.

public class Recursion4 {

    public static int callGuest(int n) {

        if (n <= 1) {
            return 1;
        }

        // Single
        int way1 = callGuest(n - 1);

        // Pair
        int way2 = (n - 1) * callGuest(n - 2);

        return way1 + way2;
    }
    
    public static void main(String[] args) {
        
        int n = 4;
        System.out.println(callGuest(n));
    }
}
