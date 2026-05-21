public class Sudoku {

    public boolean helper(char[][] board, int row, int cols) {

        if (row == board.length) {
            return true;
        }

        int nrow = 0;
        int ncols = 0;

        if (cols != board.length - 1) {
            nrow = ncols;
            ncols = cols + 1;
        } else {
            nrow = row + 1;
            ncols = 0;
        }

        if (board[row][cols] != '.') {
            if (helper(board, nrow, ncols)) {
                return true;
            }
        } else {
            for(int i = 1; i <= 9; i++) {
                if (isSafe(board, row, cols, i)) {
                    board[row][cols] = (char) (i + '0');
                    if (helper(board, nrow, ncols)) {
                        return true;
                    } else {
                        board[row][cols] = '.';
                    }
                }
            }
        }

        return false;

    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

}