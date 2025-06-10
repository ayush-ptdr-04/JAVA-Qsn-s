package assignment;

import java.util.*;

public class arrayQna {
    public static void main(String args[]) {
        int arr[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        // System.out.println(containDuplicate(arr));
        int arr2[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        // System.out.println(targetIndex(arr2, target));

        int prices[] = { 7, 1, 5, 3, 6, 4 };
        // System.out.println(maxProfit(prices));

        int height[] = { 0, 1, 2, 1, 1, 3, 2, 1, 2, 0 };
        // System.out.println("total Trapped water: " + trappedWater(height));

        int height2[] = { -1, 0, 1, 2, -1, -4 };
        System.out.println(setOfTriplets(height2));
    }

    public static List<List<Integer>> setOfTriplets(int nums[]) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if (k != i && k != j && i != j) {
                        if (nums[i] + nums[j] + nums[k] == 0) {
                            List<Integer> triplet = new ArrayList<>();
                            triplet.add(nums[i]);
                            triplet.add(nums[j]);
                            triplet.add(nums[k]);
                            Collections.sort(triplet);
                            result.add(triplet);
                        }
                    }
                }
            }
        }

        // Remove duplicates while preserving insertion order
        result = new ArrayList<>(new LinkedHashSet<>(result));

        return result;
    }

    public static int trappedWater(int height[]) {

        int n = height.length;

        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        int trappingWater = 0;

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        rightMax[0] = height[n - 1];
        for (int i = n - 2; i > 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);

        }

        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappingWater += (waterLevel - height[i]);
        }

        return trappingWater;
    }

    public static int maxProfit(int prices[]) {

        int maxProfit = Integer.MIN_VALUE;
        int buyPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {

            int profit = prices[i] - buyPrice;
            if (buyPrice < prices[i]) {
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }

        }

        return maxProfit;
    }

    public static int targetIndex(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[start] < arr[end]) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }

        return -1;
    }

    public static boolean containDuplicate(int arr[]) {
        // Approach 1 - Brute Force (O(n^2))
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
//