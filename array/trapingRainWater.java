public class trapingRainWater {
    public static void main(String atgs[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("Total Trapping water is: " + trappingRainWater(height));
    }

    public static int trappingRainWater(int height[]) {
        int n = height.length;
        int leftMax[] = new int[height.length];
        int rightMax[] = new int[height.length];
        int trappedWater = 0;

        // calculate leftMax of array
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);

        }

        // calculate rightMax of array
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);

        }

        for (int i = 0; i < n; i++) {
            // find minimum value b/w right&leftMax
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // stored water b/w waterLevel-height[i]
            trappedWater += (waterLevel - height[i]);
        }

        return trappedWater;

    }
}