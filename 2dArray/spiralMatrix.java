public class spiralMatrix {
    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        spiralMatrix(matrix);
    }

    public static void spiralMatrix(int matrix[][]) {
        int starRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        while (starRow <= endRow && startCol <= endCol) {

            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[starRow][j] + ", ");
            }

            for (int i = starRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + ", ");
            }

            for (int j = endCol - 1; j >= startCol; j--) {
                if (starRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + ", ");
            }

            for (int i = endRow - 1; i >= starRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + ", ");
            }

            starRow++;
            startCol++;
            endRow--;
            endCol--;
        }

    }
}
