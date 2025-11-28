public class fillSudoku {

    public static void printSudoku(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudoku[][] = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 7, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };
        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution is exists");
            printSudoku(sudoku);
        } else {
            System.out.println("Solution is not exists");

            printSudoku(sudoku);
        }
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        // base case
        if (row == 9 && col == 0) {
            return true;
        }

        // find row & col
        int newRow = row, newCol = col + 1;
        if (col + 1 == 9) {
            newRow = row + 1;
            newCol = 0;
        }

        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, newRow, newCol);
        }

        // recursion
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku, newRow, newCol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        // column
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        // row
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // grid
        int strRow = (row / 3) * 3;
        int strCol = (col / 3) * 3;
        for (int i = strRow; i < strRow + 3; i++) {
            for (int j = strCol; j < strCol + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }
}
