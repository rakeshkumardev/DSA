public class PalindromeRec {
    static int sum = 0;

    public static void main(String[] args) {
        int n = 1221;
        sum = 0;
        reverse1(n);
        System.out.println(palindromeCheck(n));
    }

    // ==============================================================================
    // Recursive Palindrome Check (with Helper Function)
    // Time Complexity: O(log10(n))
    // Space Complexity: O(log10(n)) (Recursive Call Stack)
    static void reverse1(int n) {
        if (n == 0) {
            return;
        }
        int lastdigit = n % 10;
        sum = sum * 10 + lastdigit;
        reverse1(n / 10);
    }

    static boolean palindromeCheck(int n) {
        return sum == n;
    }
}
