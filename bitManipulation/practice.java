package bitManipulation;

public class practice {
    public static void main(String[] args) {
        int r = 4 ^ 4;
        // System.out.println(r);
        swapTwoNum(50,40);
    }
    public static void swapTwoNum(int x, int y ) {
         System.out.println("Before-Swap x = "+x+", y = "+y);
         x = x^y;
         y = x^y;
         x = x^y;
         System.out.println("After-Swap x = "+x+", y = "+y);
    }
}
