public class pairingProblem {
    public static void main(String[] args) {
        System.out.println(frndsPairing(3));
    }

    public static int frndsPairing(int n){
        if(n==1 || n==2){
            return n;
        }

        return frndsPairing(n-1)+n-1*frndsPairing(n-2);
    }
}
