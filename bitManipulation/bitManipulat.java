package bitManipulation;

public class bitManipulat {
    public static void main(String args[]) {
        // oddOrEven(100);
        // System.out.println(getIthBit(14, 3));
        // System.out.println( setIthBit(14,0));
        // System.out.println(clearIthBit(14, 2));
        // System.out.println(updateIthBit(10, 2, 1)); 
        // System.out.println(clearLastIBits(15,2));
        // System.out.println(clearRangeBits(10, 4, 2));
        // System.out.println(isPowerOfTwo(8));
        // System.out.println(countOfSetBit(10));
        // System.out.println(fastExponatiation(2, 10));
    }

    public static int fastExponatiation(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static int countOfSetBit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int clearRangeBits(int n, int j, int i) {
        int a = (~0) << j + 1;
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static int clearLastIBits(int n, int i) {
        int bitMask = ~(0) << i;
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        // System.out.println(getIthBit(n, i));

        // } else {
        // System.out.println(setIthBit(n, i));
        // }

        // Or
        n = clearIthBit(n, i);
        int BitMask = newBit << i;
        return n | BitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int getIthBit(int n, int i) {
        int gitMask = 1 << i;
        if ((n & gitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }

}