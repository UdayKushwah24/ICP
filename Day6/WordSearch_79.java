package InfinityChampionsProgram.Day6;

public class WordSearch_79 {
    static boolean isExists = false;

    public static boolean Search(char[][] board, String word, int row, int col, int idx) {
        if (word.length() == idx) {
            // isExists = true;
            return true;
        }

        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length
                || board[row][col] != word.charAt(idx)) {
            return false;
        }

        int[] r = { -1, 1, 0, 0 };
        int[] c = { 0, 0, -1, 1 };
        board[row][col] = '*';
        for (int i = 0; i < c.length; i++) {
            boolean ans = Search(board, word, row + r[i], col + c[i], idx + 1);
            if (ans) {

                return true;
            }
        }
        board[row][col] = word.charAt(idx);
        return false;
    }

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean ans = Search(board, word, i, j, 0);
                    if (ans) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}