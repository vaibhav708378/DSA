class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {

                char nums = board[i][j];
                if(nums == '.') {
                    continue;
                }

                if(!seen.add(nums + " in row" + i) ||
                !seen.add(nums + " in col " + j) ||
                !seen.add(nums + " in box " + i / 3 + "-" + j / 3)) {
                    return false;
                }
            }
        }

        return true;
    }
}