// LinearSearch
/*
 * package array;
 * 
 * public class linearSearch {
 * 
 * public static void main(String args[]) {
 * int arr[] = { 1, 2, 3, 4, 5 };
 * int key = 2;
 * int i = findIndex(arr, key);
 * 
 * if (i == -1) {
 * System.out.println("NOT FOUND");
 * } else {
 * System.out.println("Your key: " + key + " on " + i + " index");
 * }
 * 
 * }
 * 
 * public static int findIndex(int arr[], int key) {
 * for (int i = 0; i < arr.length; i++) {
 * if (arr[i] == key) {
 * return i;
 * }
 * }
 * return -1;
 * }
 * }
 */

// largest number

import java.util.*;

public class linearSearch {
    public static void main(String args[]) {
        int arr[] = { 1, 200, 30, 4, 5, 6 };
        largestNum(arr);
    }

    public static void largestNum(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        System.out.println("Your largest is: " + largest);
    }
}