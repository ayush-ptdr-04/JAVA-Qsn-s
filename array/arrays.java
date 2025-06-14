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

/*
 * print max-subArrays-sum(Prfix array)
 * 
 * public class arrays {
 * 
 * public static void main(String args[]) {
 * int arr[] = { -1, 12, -1, -4 };
 * // sumOfSubArray(arr);
 * kadansSumOfArray(arr);
 * }
 * 
 * public static void kadansSumOfArray(int arr[]) {
 * int currSum = 0;
 * int maxSum = Integer.MIN_VALUE;
 * for (int i = 0; i < arr.length; i++) {
 * 
 * currSum = currSum + arr[i];
 * if (currSum < 0) {
 * currSum = 0;
 * }
 * maxSum = Math.max(maxSum, currSum);
 * 
 * }
 * System.out.println("Max is: " + maxSum);
 * }
 * 
 * public static void sumOfSubArray(int arr[]) {
 * int currSum = 0;
 * int max = Integer.MIN_VALUE;
 * int prefix[] = new int[arr.length];
 * 
 * prefix[0] = arr[0];
 * 
 * for (int i = 1; i < arr.length; i++) {
 * prefix[i] = prefix[i - 1] + arr[i];
 * }
 * 
 * for (int i = 0; i < arr.length; i++) {
 * int start = i;
 * for (int j = i; j < arr.length; j++) {
 * int end = j;
 * 
 * currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
 * 
 * if (max < currSum) {
 * max = currSum;
 * }
 * }
 * }
 * System.out.println("max is: " + max);
 * }
 * }
 */

/*
 * contain most water 11.
 * public class arrays {
 * 
 * public static void main(String args[]) {
 * int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
 * System.out.println(container(height));
 * }
 * 
 * // in this logic we can reduce time and space complexity
 * public static int container(int height[]) {
 * int n = height.length;
 * int maxArea = 0;
 * 
 * // initial values
 * int start = 0;
 * int end = n - 1;
 * while (start < end) {
 * int h = Math.min(height[start], height[end]);
 * int w = end - start;
 * int currArea = h * w;
 * maxArea = Math.max(maxArea, currArea);
 * 
 * if (height[start] < height[end]) {
 * start++;
 * } else {
 * end--;
 * }
 * 
 * }
 * 
 * return maxArea;
 * }
 * }
 */

/* 1. two sum */
public class arrays {
    public static void main(String args[]) {
        int nums[] = { 0, 6, 9, 10, 17, 18 };
        int target = 16;
        int result[] = indicesNums(nums, target);
        if (result.length == 3) {
            System.out.println("[" + result[0] + ", " + result[1] + ", " + result[2] + "]");
        } else {
            System.out.println("No such triplet found.");
        }
    }

    public static int[] indicesNums(int nums[], int target) {
        for (int i = 0; i < nums.length; i++) {

            int start = 0;
            int end = nums.length - 1;
            int ans = target - nums[i];

            while (start < end) {
                int addTwoNums = nums[start] + nums[end];
                if (addTwoNums == ans) {
                    return new int[] { i, start, end };
                } else if (addTwoNums < ans) {
                    start++;
                } else {
                    end--;
                }
            }

        }
        return new int[] {};
    }
}
