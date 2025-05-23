import java.util.Scanner;

public class functions {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // -------------------------averageOfThree--------------------------

        /*
         * System.out.print("Enter the First no: ");
         * double a = sc.nextDouble();
         * 
         * System.out.print("Enter the Second no: ");
         * double b = sc.nextDouble();
         * 
         * System.out.print("Enter the Third no: ");
         * double c = sc.nextDouble();
         * 
         * System.out.println("The average value is: " + avgNum(a, b, c));
         */

        // -------------------------isEven--------------------------

        /*
         * System.out.print("Enter you no: ");
         * int n = sc.nextInt();
         * 
         * if (isEven(n)) {
         * System.out.println("Your no. is even");
         * } else {
         * System.out.println("Your no. is not even");
         * 
         * }
         */

        // -------------------------isPalindrome--------------------------

        /*
         * System.out.print("Enter your no: ");
         * int n = sc.nextInt();
         * if (isPalindrome(n)) {
         * System.out.println(n + " : is palindrome");
         * } else {
         * System.out.println(n + " : is not palindrome");
         * }
         */

        // -------------------------methods--------------------------

        /*
         * System.out.println("Enter no: ");
         * int n = sc.nextInt();
         * methods(n);
         */

        // -------------------------methodComputeTheSum--------------------------

        System.out.print("Enter your Integer value: ");
        int n = sc.nextInt();

        computeSum(n);

    }

    public static void computeSum(int n) {
        int sum = 0;
        int num = n;
        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("Sum is: " + sum);
    }

    public static void methods(int n) {
        int n2 = 5;
        System.out.println("Find minimum: " + Math.min(n, n2));
        System.out.println("Find maximum: " + Math.max(n, n2));
        System.out.println("Find square root: " + Math.sqrt(n));
        System.out.println("Find no of n power: " + Math.pow(n, n2));
        System.out.println("change positive root: " + Math.abs(-n));

    }

    public static boolean isPalindrome(int n) {
        int num = n;

        int reverse = 0;
        while (num > 0) {
            int ld = num % 10;
            reverse = reverse * 10 + ld;

            num = num / 10;
        }
        if (reverse == n) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static double avgNum(double a, double b, double c) {
        return (a + b + c) / 3;

    }

}
