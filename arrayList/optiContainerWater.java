package arrayList;

import java.util.*;

public class optiContainerWater {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(maxWater(list));
    }

    public static int maxWater(ArrayList<Integer> list) {
        int leftPointer = 0;
        int rightPointer = list.size() - 1;
        int maxWaterContain = Integer.MIN_VALUE;
        while (leftPointer < rightPointer) {
            int height = Math.min(list.get(leftPointer), list.get(rightPointer));
            int width = rightPointer - leftPointer;
            int currWater = height * width;
            maxWaterContain = Math.max(maxWaterContain, currWater);
            if (list.get(leftPointer) < list.get(rightPointer)) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return maxWaterContain;
    }
}
