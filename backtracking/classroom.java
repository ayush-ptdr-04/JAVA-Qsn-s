package backtracking;

public class classroom {
    public static void main(String[] args) {
        int nums[] = { 2, 3, 5, 10, 12 };
        backtrackingOfArray(nums, 0, 1);
        printArray(nums);
    }

    public static void backtrackingOfArray(int nums[], int i, int val) {
        if (i == nums.length) {
            printArray(nums);
            return;
        }

        nums[i] = val;
        backtrackingOfArray(nums, i + 1, val + 1);
        nums[i] = val - 2;
    }

    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println();
    }
}
