public class ReversedNum {
    public static void main(String[] args) {
        System.out.println(ReversedNum.revNumber(280));
    }

    // ==============================================================================
    // 1. Brute-Force Method
    // Time Complexity: O(log10(n))
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static int revNumber(int n) {
        int revNumber = 0;
        while (n > 0) {
            int ld = n % 10;
            revNumber = (revNumber * 10) + ld;
            n = n / 10;
        }
        return revNumber;
    }

}