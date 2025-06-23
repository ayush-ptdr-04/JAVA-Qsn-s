public class diagonalSum {
    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };
        calculatDaigonal(matrix);
    }

    public static void calculatDaigonal(int matrix[][]) {
        int n = matrix.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            // Primary-Daigonal-Sum
            sum += matrix[i][i];

            // Secondary-Diagonal-Sum
            if (i != n - 1 - i) {
                sum += matrix[i][n - 1 - i];
            }
        }
        System.out.println(sum);
    }
}
