package sorting;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class sorting {
    public static void main(String args[]) {
        Integer arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // countingSort(arr);
        Arrays.sort(arr, 0, 5, Collections.reverseOrder());
        printArr(arr);

    }

    public static void countingSort(int arr[]) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                count[i]--;
                j++;
            }
        }

    }

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void printArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int turn = 0; turn < n - 1; turn++) {
            for (int j = turn + 1; j < n - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}