// Q7. Print all the subsequences of a string.  ------------ IMP

public class Recursion7 {

    public static void subSequences(String str, int idx, String newString) {

        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char cuurChar = str.charAt(idx);

        //to be
        subSequences(str, idx + 1, newString + cuurChar);

        //not to be
        subSequences(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        
        String str = "abc";

        subSequences(str, 0, "");

    }
}