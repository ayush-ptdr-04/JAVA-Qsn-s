public class arrays2DQna {
    public static void main(String args[]) {
        int matrix[][] = { { 1, 4, 9 }, { 11, 4, 3 } };
        int key = 7;
        // countOfKey(matrix, key);
        // sumOfNum(matrix);
        transposeMatrix(matrix);

    }

    public static void transposeMatrix(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;
        int transpose[][] = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        printMatrix(transpose);
    }

    public static void printMatrix(int transpose[][]) {
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void sumOfNum(int matrix[][]) {
        int sum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            sum += matrix[1][j];
        }
        System.out.println(sum);
    }

    public static void countOfKey(int matrix[][], int key) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
