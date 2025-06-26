public class arrays {
    public static void main(String args[]) {
        int nums[] = { 3, 2, 3 };
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int nums[]) {
        int majority = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > majority) {
                return nums[i];
            }
        }
        return 0;
    }
}