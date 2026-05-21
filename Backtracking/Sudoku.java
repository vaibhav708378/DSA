public class Sudoku {

    public boolean isSafe(char[][] board, int row, int cols, int number) {
        //row and columns
        for(int i = 0; i < board.length; i++) {
            if (board[i][cols] == (char) (number + '0')) {
                return false;
            }
            if (board[row][i] == (char) (number + '0')) {
                return false;
            }
        }

        //Grid
        int srow = (row / 3) * 3;
        int scols = (cols / 3) * 3;
        
        for(int i = srow; i < srow + 3; i++) {
            for(int j = scols; j < scols; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

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