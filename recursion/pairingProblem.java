public class pairingProblem {
    public static void main(String[] args) {
        System.out.println(frndsPairing(3));
    }

    public static int frndsPairing(int n){
        if(n==1 || n==2){
            return n;
        }

        int fnm1 = frndsPairing(n-1);
        int fnm2 = frndsPairing(n-2);
        int waysPairs = (n-1)*fnm2;
        return fnm1+waysPairs;
    }
}
