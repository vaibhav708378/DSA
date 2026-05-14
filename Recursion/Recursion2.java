// Q2. Count totsl paths in a mazeto move from (0, 0) to (n, m).
/*
Conditions:- 
    1.Move Right 
    2. Move down 
    3. digonal is not possible
*/

public class Recursion2 {

    public static int countPaths(int i, int j, int n, int m) {

        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // Move Downwards
        int downPath = countPaths(i + 1, j, n, m);

        // Move Right
        int rightPath = countPaths(i, j + 1, n, m);

        return downPath + rightPath;
    }
    
    public static void main(String[] args) {
        
        int n = 3;
        int m = 3;

        int totalPaths = countPaths(0, 0, n, m);
        System.out.println(totalPaths);
    }
}
