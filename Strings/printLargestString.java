package Strings;

public class printLargestString {
    public static void main(String args[]) {
        String str[] = { "aayush", "aman", "kanha" };
        largestString(str);
    }

    public static void largestString(String str[]) {
        String largest = str[0];
        for (int i = 0; i < str.length; i++) {
            if (largest.compareTo(str[i]) < 0) {
                largest = str[i];
            }
        }
        System.out.println(largest);
    }
}
