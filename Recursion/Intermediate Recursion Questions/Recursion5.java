// Q5. Mov all 'x' to the end of the string

public class Recursion5 {

    public static void movAllx(String str, int idx, int count, String newString) {

        if(idx == str.length() - 1) {
            for(int i = 0; i < count; i++) {
                newString += 'x';
            }

            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

        if(currChar == 'x') {
            count++;
            movAllx(str, idx + 1, count, newString);
        } else {
            newString += currChar;
            movAllx(str, idx + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        
        String str = "axbcxxd";

        movAllx(str, 0, 0, "");
    }
}