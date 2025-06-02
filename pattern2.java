import java.util.*;

public class pattern2 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int totalRows = sc.nextInt();
        // System.out.print("ENter cols: ");
        // int totalCols = sc.nextInt();

        // hollowRect(totalRows, totalCols);
        // i_r_h_Pyramid(totalRows);
        // i_h_PyramidNumber(totalRows);
        // floydTriangle(totalRows);
        // O_1_triangle(totalRows);
        // butterFly(totalRows);
        // solidRhombus(totalRows);
        // h_s_Rohmbus(totalRows);
        diamond(totalRows);

    }

    public static void diamond(int totalRows) {
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= totalRows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (i - 1) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = totalRows; i >= 1; i--) {
            for (int j = 1; j <= totalRows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (i - 1) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void h_s_Rohmbus(int totalRows) {
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= (totalRows - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= totalRows; j++) {
                if (i == 1 || i == totalRows || j == 1 || j == totalRows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void solidRhombus(int totalRows) {
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= (totalRows - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= totalRows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void butterFly(int totalRows) {
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * (totalRows - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = totalRows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * (totalRows - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void O_1_triangle(int totalRows) {

        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }

    public static void floydTriangle(int totalRows) {
        int n = 0;
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= i; j++) {
                n++;
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    public static void i_h_PyramidNumber(int totalRows) {
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= totalRows - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void i_r_h_Pyramid(int totalRows) {
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= totalRows - i; j++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowRect(int r, int c) {

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || j == 1 || i == r || j == c) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}