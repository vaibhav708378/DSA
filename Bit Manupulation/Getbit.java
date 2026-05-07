public class Getbit{

    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 2; //start from last index, pos = 2 = 1

        int bitmask = 1<<pos;

        if ((bitmask & n) == 0) {
            System.out.println("Bit was zero");
        } else {
            System.out.println("Bit was one");
        }
    } 
}