public class insertionCount {
    public static void main(String args[]) {
        int arr[] = { 2, 4, 1, 3, 5 };
        int ans = findInsertionSort(arr, 0, arr.length - 1);
        System.out.println(ans);
    }

    public static int findInsertionSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return 0;
        }
        int mid = si + (ei - si) / 2;

        int left = findInsertionSort(arr, si, mid);
        int right = findInsertionSort(arr, mid + 1, ei);

        int count = merge(arr, si, mid, ei);
        return count + left + right;
    }

    public static int merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        int incCount = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                incCount += (mid - i + 1);
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (i = si, k = 0; k < temp.length; i++, k++) {
            arr[i] = temp[k];
        }
        return incCount;
    }
}