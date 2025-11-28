package arrayList;

import java.util.*;

public class containerWater {
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
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int hgt = Math.min(list.get(i), list.get(j));
                int width = j - i;
                int water = hgt * width;
                max = Math.max(max, water);
            }
        }
        return max;
    }
}
