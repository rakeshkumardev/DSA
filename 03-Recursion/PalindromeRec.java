public class PalindromeRec {
    static int sum = 0;

    public static void main(String[] args) {
        System.out.println(PalindromeCheck.palindromeCheck(12));

    }

    // Helper function of the palindrome check
    static void reverse1(int n) {
        if (n == 0) {
            return;
        }
        int lastdigit = n % 10;
        sum = sum * 10 + lastdigit;
        reverse1(n / 10);
    }

    // Main Function to Check Palindrome
    static boolean palindromeCheck(int n) {
        return sum == n;
    }
}
