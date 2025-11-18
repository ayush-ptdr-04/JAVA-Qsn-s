public class leetCode {

    public static void main(String[] args) {
        int nums[] = { 5, 1, 2, 3, 0 };
        System.out.println(missedNum(nums));
    }

    public static int missedNum(int nums[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(nums[i], largest);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[j] = i;
                j++;
                count[i]--;
            }
        }

        for (int i = 0; i < count.length - 1; i++) {
            if (nums[i + 1] - nums[i] != 1) {
                return nums[i] + 1;
            }
        }
        return largest + 1;

    }
}