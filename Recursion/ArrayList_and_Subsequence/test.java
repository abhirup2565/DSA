public class test {
    public static void main(String[] args) {
        int[][] board = new int[4][4];
        int targetQueen = 3;
        path(board, 1, 0, 0, targetQueen, "");
    }

    public static void path(int[][] board, int currentQueen, int current_row, int current_col, int targetQueen, String positions) {
        if (currentQueen == targetQueen) {
            System.out.println(positions + current_row + "-" + current_col + ".");
            return;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != 1) {
                    int[][] copy = deepCopy(board); // safe copy
                    fill(copy, i, j, 1);
                    path(copy, currentQueen + 1, i, j, targetQueen, positions + i + "-" + j + ",");
                }
            }
        }
    }

    public static void fill(int[][] board, int current_row, int current_col, int value) {
        // Place queen
        board[current_row][current_col] = value;

        // Fill horizontal
        for (int h = 0; h < board[0].length; h++) {
            board[current_row][h] = value;
        }

        // Fill vertical
        for (int v = 0; v < board.length; v++) {
            board[v][current_col] = value;
        }

        // Diagonals (↖ and ↗)
        int r = current_row - 1;
        int lc = current_col - 1;
        int rc = current_col + 1;
        while (r >= 0) {
            if (lc >= 0) board[r][lc] = value;
            if (rc < board[0].length) board[r][rc] = value;
            r--;
            lc--;
            rc++;
        }

        // Diagonals (↙ and ↘)
        r = current_row + 1;
        lc = current_col - 1;
        rc = current_col + 1;
        while (r < board.length) {
            if (lc >= 0) board[r][lc] = value;
            if (rc < board[0].length) board[r][rc] = value;
            r++;
            lc--;
            rc++;
        }
    }

    public static int[][] deepCopy(int[][] original) {
        int[][] copy = new int[original.length][original[0].length];
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[0].length; j++) {
                copy[i][j] = original[i][j];
            }
        }
        return copy;
    }
}
