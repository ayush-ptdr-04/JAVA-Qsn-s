package Strings;

import java.util.Scanner;

public class reversString {
    public static void main(String args[]) {
        String str = new Scanner(System.in).nextLine();
        System.out.println(reversWords(str));
    }

    public static String reversWords(String str) {
        StringBuilder newStr = new StringBuilder();
        String[] words = str.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            newStr.append(words[i] + " ");
        }
        return newStr.toString();
    }
}
