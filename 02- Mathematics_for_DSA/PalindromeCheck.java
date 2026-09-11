public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(PalindromeCheck.palindromeCheck(1221));
    }

    // Brute-Force Method
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
