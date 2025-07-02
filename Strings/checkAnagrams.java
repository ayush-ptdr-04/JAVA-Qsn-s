package Strings;

import java.util.*;

public class checkAnagrams {

    public static void main(String args[]) {
        String str1 = new Scanner(System.in).next();
        String str2 = new Scanner(System.in).next();

        System.out.println(isAnagram(str1, str2));
    }

    public static boolean isAnagram(String s, String t) {

        s = s.toLowerCase();
        t = t.toLowerCase();

        if (s.length() == t.length()) {
            char[] str1 = s.toCharArray();
            char[] str2 = t.toCharArray();

            Arrays.sort(str1);
            Arrays.sort(str2);

            boolean result = Arrays.equals(str1, str2);
            if (result) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }

    }

}