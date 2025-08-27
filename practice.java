import java.util.Scanner;

public class practice {

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int rows = sc.nextInt();
        // int colls = sc.nextInt();
        // printHollogram(rows, colls);
        // i_r_h_Pyramid(rows);
        // i_h_PyramidNumber(rows);
        // butterFly(rows);
        int arr[] = { 5, 4, 1, 3, 2 };
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void bubbleSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void butterFly(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < (rows * 2 - 2) - (2 * i); j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < (rows * 2 - 2) - (2 * i); j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void i_h_PyramidNumber(int rows) {
        for (int i = 0; i < rows; i++) {
            int count = 0;
            for (int j = 0; j < rows - i; j++) {
                count++;
                System.out.print(count);
            }
            System.out.println();
        }
    }

    public static void i_r_h_Pyramid(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printHollogram(int rows, int colls) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < colls; col++) {
                if (row == 0 || col == 0 || row == rows - 1 || col == colls - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}