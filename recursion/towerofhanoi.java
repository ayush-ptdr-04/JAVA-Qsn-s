public class towerofhanoi {
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
    }

    public static void towerOfHanoi(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("01-disk-" + n + " moved from " + source + " to " + destination);
            return;
        }

        towerOfHanoi(n - 1, source, helper, destination);
        System.out.println("02-disk-" + n + " moved from " + source + " to " + destination);
        towerOfHanoi(n - 1, helper, source, destination);
    }
}
