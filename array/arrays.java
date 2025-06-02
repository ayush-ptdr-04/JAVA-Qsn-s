/*
 * 
 * Pairs in an ARRAY
 * 
 * public class arrays {
 * 
 * public static void main(String args[]) {
 * int arr[] = { 2, 4, 6, 8, 10, 12 };
 * pairsArr(arr);
 * }
 * 
 * public static void pairsArr(int arr[]) {
 * int count = 0;
 * for (int i = 0; i < arr.length - 1; i++) {
 * int curr = arr[i];
 * for (int j = i + 1; j < arr.length; j++) {
 * count++;
 * System.out.print("(" + curr + ", " + arr[j] + ")" + "  ");
 * }
 * System.out.println();
 * }
 * System.out.println(count + " : Pairs");
 * }
 * }
 */

/* print sub-arrays */

public class arrays {

    public static void main(String args[]) {
        int arr[] = { 0, 2, 4, 5, 6 };
        subArray(arr);
    }

    public static void subArray(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i, end = i;
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum = sum + arr[k];
                }

                if (max < sum) {
                    max = sum;
                }
                if (min > sum) {
                    min = sum;
                }
                System.out.print(sum + ", ");
                end++;
            }
            System.out.println();
        }
        System.out.println("Max sum of num is: " + max);
        System.out.println("Min sum of num is: " + min);
    }
}