package DSA_04_BACKTRACKING;

public class dsa_01_np_queens_problem {
    final static int N = 7;

    public static void main(String[] args) {
        solveNQ();
    }

    static boolean solveNQ() {
//        int[][] board = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] board = new int[N][N];
        if (!solveNQueen(board, 0)) {
            System.out.println("solution not exist");
            return false;
        }
        printSolution(board);
        return true;
    }

    static void printSolution(int board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean solveNQueen(int board[][], int col) {
        if (col >= N) {
            return true;
        }
        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;
                if (solveNQueen(board, col + 1))
                    return true;
                board[i][col] = 0;
            }
        }
        return false;
    }

    static boolean isSafe(int board[][], int row, int col) {
        int i, j;
        for (i = 0; i < col; i++) {
            if (board[row][i] == 1)
                return false;
        }
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }
        for (i = row, j = col; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 1)
                return false;
        }
        return true;
    }
}
