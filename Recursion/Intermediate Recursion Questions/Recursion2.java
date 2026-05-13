// Q2. Print String in Reverse.

public class Recursion2 {
    
    public static void reverseStr(String str, int idx) {
        
        if(idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }

        System.out.println(str.charAt(idx));
        reverseStr(str, idx - 1);
    }

    public static void main(String[] args) {
        
        String str = "Vaibhav";
        reverseStr(str, str.length() - 1);
    }
}
