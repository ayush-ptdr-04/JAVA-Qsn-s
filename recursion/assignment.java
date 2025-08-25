public class assignment {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        // getOcurrance(2, 0, arr);
        // strOfEng(2019);
System.out.println(findLength("aayushAditor"));
    }

    public static int findLength(String str) {
        if (str.length()==0) {
            return 0;
        }
        return findLength(str.substring(1))+1;
    }

    public static void strOfEng(int n) {
        String str[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        if (n == 0) {
            return;
        }
        int lastDigit = n % 10;
        strOfEng(n / 10);
        System.out.print(str[lastDigit] + " ");
    }

    public static void getOcurrance(int key, int n, int arr[]) {
        if (n == arr.length) {
            return;
        }
        if (arr[n] == key) {
            System.out.print(n + " ");
        }
        getOcurrance(key, n + 1, arr);
    }
}
