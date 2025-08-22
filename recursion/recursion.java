package recursion;

public class recursion {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 1, 2, 5, 4, 5 };
        // printOtoN(n);
        // System.out.println(fact(n));
        // printName(n);
        // System.out.println( sumOfDgits(123436));
        // System.out.println(baseAndpower(2,5));
        // System.out.println(sumOfN(5));
        // printReverse(10);
        // System.out.println(fibonacchi(5));
        // fun(3);
        // fun2(3);
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOccurance(arr, 0, 5));
        // System.out.println(lastOccurance(arr,0,5));
        System.out.println(optimizedBasePower(2,10));
    }

    public static int optimizedBasePower(int base, int exp) {
        if(exp==0){
            return 1;
        }
        int halfPower = optimizedBasePower(base, exp/2);
        int halfPowerSq = halfPower*halfPower;
        if(exp%2!=0){
            halfPowerSq = base*halfPowerSq;
        }
        return halfPowerSq;
    }

    public static int lastOccurance(int arr[], int i,int key) {
       if(i == arr.length){
        return -1;
       }
       int isFound = lastOccurance(arr, i+1, key);
       if(isFound==-1&&arr[i]==key){
        return i;
       }
       return isFound;
    }

    public static int firstOccurance(int arr[], int i, int key) {
        
        if(i==arr.length){
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurance(arr, i+1, key);
        
    }

    public static boolean isSorted(int arr[], int i) {
        if (arr.length - 1 == i) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static void fun2(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n);
        fun2(n - 1);
        System.out.print(n);
    }

    public static void fun(int n) {
        if (n < 1) {
            return;
        }
        fun(n - 1);
        ;
        System.out.print(n + ",");
        fun(n - 1);
    }

    public static int fibonacchi(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            int fnm1 = fibonacchi(n - 1);
            int fnm2 = fibonacchi(n - 2);
            return fnm1 + fnm2;
        }
    }

    public static void printReverse(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        } else {
            printReverse(n - 1);
            System.out.println(n);
        }
    }

    public static int sumOfN(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n + sumOfN(n - 1));
        }
    }

    public static int baseAndpower(int base, int exp) {
        if (exp == 1) {
            return base;
        } else {
            return (base * baseAndpower(base, exp - 1));
        }
    }

    public static int sumOfDgits(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumOfDgits(n / 10);
        }
    }

    public static void printName(int n) {
        if (n == 1) {
            System.out.print("Aayush" + ", ");
        } else {
            System.out.print("Aayush" + ",");
            printName(n - 1);
        }
        return;
    }

    public static void printOtoN(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        printOtoN(n - 1);
        System.out.println(n + " ");

    }
}
