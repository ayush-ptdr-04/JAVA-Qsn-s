// package Strings;

// import java.util.Scanner;

// public class palindrome {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();

//         System.out.println(isPalindrome(str));
//     }

//     public static boolean isPalindrome(String str) {
//         int n = str.length();
//         for (int i = 0; i < n / 2; i++) {
//             if (str.charAt(i) != str.charAt(n - 1 - i)) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }

package Strings;

import java.util.*;

public class palindrome {
    public static void main(String args[]) {
        String str = new Scanner(System.in).nextLine();
        System.out.println(isPalindrome(str));
    }

    public static Boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        str = str.toLowerCase();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}