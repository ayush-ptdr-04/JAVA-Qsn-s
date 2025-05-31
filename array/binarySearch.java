public class binarySearch {

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int key = 5;
        int result = sortedArray(arr, key);
        if (result == -1) {
            System.out.println("KEY IS NOT FOUND");
        } else {

            System.out.println("Element found at index: " + result);
        }
    }

    public static int sortedArray(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            // comparison
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1; // rigth
            } else {
                end = mid - 1; // left
            }

        }
        return -1;

    }

}
