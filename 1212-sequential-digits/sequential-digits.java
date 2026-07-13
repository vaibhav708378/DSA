import java.util.*;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        String digits = "123456789";
        
        int n = digits.length();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j + i <= n; j++) {
                String sub = digits.substring(j, j + i);
                int num = Integer.parseInt(sub);
                
                if (num >= low && num <= high) {
                    result.add(num);
                }
            }
        }
        
        Collections.sort(result);
        return result;
    }
}