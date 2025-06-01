// Pairs in an ARRAY

public class arrays {

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10, 12 };
        pairsArr(arr);
    }

    public static void pairsArr(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                count++;
                System.out.print("(" + curr + ", " + arr[j] + ")" + "  ");
            }
            System.out.println();
        }
        System.out.println(count + " : Pairs");
    }
}