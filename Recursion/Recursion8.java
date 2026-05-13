// Q8. Print all the unique subsequences of the string. 

import java.util.HashSet;

public class Recursion8 {

    public static void uniqsubsequences(String str, int idx, String newString, HashSet<String> set) {

        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
           } else {
            System.out.println(newString);
            set.add(newString);
            return;
           }
        }

        char currChar = str.charAt(idx);

        //to be
        uniqsubsequences(str, idx + 1, newString + currChar, set);

        //not to be
        uniqsubsequences(str, idx + 1, newString, set);
    }
    
    public static void main(String[] args) {
        
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqsubsequences(str, 0, "", set);
    }
}
