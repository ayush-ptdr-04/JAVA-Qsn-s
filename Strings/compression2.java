package Strings;

import java.util.*;

public class compression2 {
    public static void main(String args[]) {
        char[] chs = { 'a', 'b', 'b', 'b', 'c', 'c', 'c', 'd' };

        System.out.println(compress(chs));
    }

    public static String compress(char[] chs) {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < chs.length; i++) {
            int count = 1;

            while (i < chs.length - 1 && chs[i] == chs[i + 1]) {
                count++;
                i++;
            }
            str.append(chs[i]);
            if (count > 1) {
                str.append(count);
            }
        }
        return str.toString();
    }
}
