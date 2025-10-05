public class sortAnarrayOfStrings {
    public static void main(String args[]) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
        sortArray(arr, 0, arr.length - 1);
        for (String thing : arr) {
            System.err.print(thing + ", ");
        }
    }

    public static void sortArray(String arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        sortArray(arr, si, mid);
        sortArray(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }

    public static void merge(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[j].compareTo(arr[i]) < 0) {
                temp[k++] = arr[j++];
            } else {
                temp[k++] = arr[i++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (i = si, k = 0; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
}
