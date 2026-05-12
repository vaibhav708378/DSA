// Q1. Tower of Hanoi.

/*
Rules:-
    1.Only One disk tranferred in 1 step.
    2.Smaller disk ale=ways kept on larger disks.
*/

public class Recursion1 {

    public static void towerOfHanoi(int n, String src, String hepler, String dist) {
        if(n == 1) {
            System.out.println("Tensfer disk "+ n + " form " + src + " to " + dist);
            return;
        }

        towerOfHanoi(n - 1, src, dist, hepler);
        System.out.println("Tensffer disk "+ n + " form " + src + " to " + dist);
        towerOfHanoi(n - 1, hepler, src, dist);
    }
    
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
    }
}
