package Strings;

public class subString {
    public static void main(String args[]) {
        String str = "hello world";
        extractString(str, 0, 5);
    }

    public static void extractString(String str, int si, int ei) {
        String sum = "";
        for (int i = 0; i < ei; i++) {
            sum += str.charAt(i);
        }
        System.out.println(sum);
    }
}
