package Strings;

public class removeOccurance {
    public static void main(String args[]) {
        String str = "absjhabcsabc";
        String part = "abc";
        System.out.println(removePart(str, part));
    }

    public static String removePart(String str, String part) {
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            newStr.append(str.charAt(i));
            if (newStr.length() >= part.length()) {
                if (newStr.substring(newStr.length() - part.length()).equals(part)) {
                    newStr.delete(newStr.length() - part.length(), newStr.length());
                }
            }
        }
        return newStr.toString();
    }
}