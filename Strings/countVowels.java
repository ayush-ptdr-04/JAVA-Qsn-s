package Strings;

import java.util.*;

public class countVowels {
    public static void main(String args[]) {
        // Take one-word input from the user and store it in the variable str.
        // when space is coming .next() stop the sentence.
        String str = new Scanner(System.in).next();
        System.out.println(countLowerCaseVowel(str));
    }

    public static int countLowerCaseVowel(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
