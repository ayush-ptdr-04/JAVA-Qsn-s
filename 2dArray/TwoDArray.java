
import java.util.*;

public class TwoDArray {

    *
    public static void main(String args[]) {
     * Scanner sc = new Scanner(System.in);
     * int matrics[][] = new int[3][3];
     * int n = matrics.length, m = matrics[0].length;
     * // Input
     * for (int i = 0; i < n; i++) {
     * for (int j = 0; j < m; j++) {
     * matrics[i][j] = sc.nextInt();
     * }
     * }
     * // Print Output
     * for (int i = 0; i < n; i++) {
     * for (int j = 0; j < m; j++) {
     * System.out.print(matrics[i][j] + ", ");
     * }
     * System.out.println();
     * }
     * // int largest = largest(matrics, 4);
     * // System.out.println(searchLargestIndex(matrics, largest) + "," + largest);
     * 
     * }** // Find largest Element
    *

    public static boolean searchLargestIndex(int matrics[][], int largest) {
     * for (int i = 0; i < matrics.length; i++) {
     * for (int j = 0; j < matrics[0].length; j++) {
     * if (matrics[i][j] == largest) {
     * System.out.println("Largest Index is: (" + i + ", " + j + ")");
     * return true;
     * }
     * }
     * }
     * return false;
     * }** // Find Indexes of largest Element
    *

    public static int largest(int matrics[][], int key) {
     * int largest = Integer.MIN_VALUE;
     * for (int i = 0; i < matrics.length; i++) {
     * for (int j = 0; j < matrics[0].length; j++) {
     * largest = Math.max(largest, matrics[i][j]);
     * }
     * }
     * 
     * return largest;
     * }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
    }
}