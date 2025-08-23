public class printBinStr {
    public static void main(String[] args) {
        printBinaryStr(4, 0, "");
    }

    public static void printBinaryStr(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        printBinaryStr(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinaryStr(n - 1, 1, str + "1");
        }
    }
}
