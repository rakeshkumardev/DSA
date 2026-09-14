public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(PalindromeCheck.palindromeCheck(1221));
    }

    // ==============================================================================
    // 1. Brute-Force Method
    // Time Complexity: O(log10(n))
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static boolean palindromeCheck(int n) {
        if (n < 0)
            return false;
        int orignalNum = n;
        int revNumber = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            revNumber = (revNumber * 10) + lastDigit;
            n = n / 10;

        }
        return orignalNum == revNumber;
    }
}
