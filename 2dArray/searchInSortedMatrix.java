public class searchInSortedMatrix {
    public static void main(String args[]) {
        int matrix[][] = { { 10, 20, 30, 40, 50 }, { 15, 25, 35, 45, 55 }, { 17, 27, 37, 47, 57 },
                { 22, 33, 44, 55, 66 },
                { 24, 34, 44, 54, 64 } };
        stairCase(matrix, 25);
    }

    public static boolean stairCase(int matrix[][], int Key) {
        int row = matrix.length - 1;
        int col = 0;
        while (row >= 0 && col < matrix[0].length - 1) {
            if (matrix[row][col] == Key) {
                System.out.println("(" + row + " " + col + ")");
                return true;
            } else if (matrix[row][col] < Key) {
                col++;
            } else {
                row--;
            }
        }
        System.out.println("Key is Not Found!");
        return false;
    }
}
