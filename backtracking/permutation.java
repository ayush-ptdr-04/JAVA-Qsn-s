
public class permutation {
    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "");
    }

    public static void findPermutations(String str, String ans) {
        if (0 == str.length()) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutations(newStr, ans + curr);
        }
    }
}