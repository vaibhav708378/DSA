// Q3. Place tiles of size 1xm in a floor of size nxm

public class Recursion3 {

    public static int placeTiles(int n, int m) {

        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }

        // Verticsl placements
        int verticalPlace = placeTiles(n - m, m);
        
        // Horizontal placements
        int horizontalPlace = placeTiles(n - 1, m);

        return verticalPlace + horizontalPlace;
    }

    public static void main(String[] args) {
        
        int n = 4;
        int m = 2;

        System.out.println(placeTiles(n, m));
    }
    
}
