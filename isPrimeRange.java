
public class isPrimeRange {

    public static void isPrime(int range) {
        boolean isPrime = true;
        for (int i = 2; i <= range; i++) {
            isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }

        }

    }

    public static void main(String args[]) {
        isPrime(7);
    }
}