package sorting;

public class sorting {
    public static void main(String args[]) {
        int arr[] = { 3, 2, 1, 5, 4 };
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        countingSort(arr);
        printArr(arr);
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void countingSort(int arr[]) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        // find largest Element
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // make count array
        int count[] = new int[largest + 1];

        // asign indexValue based on elementNum
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // sorting Logic
        int j = 0;
        for (int i = 0; i < n; i++) {
            while (count[i] > 0) {
                count[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int curr = arr[i]; // store curr in temp. var.
            int prev = i - 1; // get previus index
            while (prev >= 0 && arr[prev] > curr) { // check prev is arr[greater] then curr.
                arr[prev + 1] = arr[prev]; // shift the arr[prev] value
                prev--; // updat previus in left side
            }
            arr[prev + 1] = curr; // fix curr in right index
        }
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
        boolean swaped;
        for (int turn = 0; turn < n - 1; turn++) {
            swaped = false;
            for (int j = 0; j < n - turn - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaped = true;
                }
            }
            if (!swaped) {
                break;
            }
        }
    }
}