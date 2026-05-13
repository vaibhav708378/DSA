// Q9. Print Keypad Combinations

public class Recursion9 {

    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printComb(String str, int idx, String combinations) {

        if (idx == str.length()) {
            System.out.println(combinations);
            return;
        }

        char currChar = str.charAt(idx);

        String mapping = keypad[currChar - '0'];

        for(int i = 0; i < mapping.length(); i++) {
            printComb(str, idx + 1, combinations + mapping.charAt(i));
        }
    }
    
    public static void main(String[] args) {
        
        String str = "23";

        printComb(str, 0, "");
    }
}
