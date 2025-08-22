public class tilingPro {
    public static void main(String[] args) {
System.out.println(arrangTiling(4));
    }
    public static int arrangTiling(int n){
        if(n==0 || n==1){
            return 1;
        }

        int verticalAlign = arrangTiling(n-1);
        int horizontalAlign = arrangTiling(n-2);

        int totWays = verticalAlign+horizontalAlign;
        return totWays;
    }
}
// now we take value of n = 4, then call arangeTiling, so now our code is run and
//  check 1st conditon n==0 or 1 these both are false now execution go on next line
// and call function it self using n-1 then execution is 4->3->2->1 and conditon is true n==1 and return 1
//  now n==2 and verticalAlign = 1;
//  now go on horizontalAlign and again func. call it self using input n-2 n==2 and 2-2=0 and it return 1
// now verticalAlign+horizontalAlign; is 2
// then again bubble back on n=3 and it have n=2=2, verticalAlign n=2 and return 2 and call horizon with inp n=2 2-2 = 0 and return 1;
// so now 2+1=3 and go on  n==4 then call n-2 check con is false then call it self with n-1 = 2-1 return 1, and bubble back on n=2 then 2-2 is return 1 it return 3 and horizon with input 3-2 is 1 it return 1
// so now 3+(1+1) is 4