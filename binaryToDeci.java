public class binaryToDeci {

    public static void binToDec(int binNum) {
        int myNum = binNum;
        int decNum = 0;
        int pow = 0;
        while (binNum > 0) {
            int lastDig = binNum % 10;
            decNum = decNum + (lastDig * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of " + myNum + ":" + decNum);
    }

    public static void decToBin(int decNum) {
        int n = decNum;
        int binNum = 0;
        int pow = 0;

        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow)); // ye line hmare binary no. ko arrange kr rahi hai
            // one'place se ....
            decNum = decNum / 2;

            pow++;

        }
        System.out.println("Decimal of" + n + ": " + binNum);

    }

    public static void main(String args[]) {
        binToDec(110000);
        decToBin(4);
    }
}
