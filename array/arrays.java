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

/* print max-subArrays-sum(Prfix array) */
public class arrays {

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4 };
        sumOfSubArray(arr);
    }

    public static void sumOfSubArray(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
            System.out.print(prefix[i] + ", ");
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("max sum is: " + maxSum);

    }
}