public class ReverseNum {
    static int sum = 0; // reverse1 Method part

    public static void main(String[] args) {
        ReverseNum.reverse1(1234);
        System.out.println(sum);
        System.out.println(ReverseNum.reverse2(4321));
    }

    // ==============================================================================
    // 1. Reverse Number with Recursion (Using Global Variable)
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

    // ==============================================================================
    // 2. Reverse Number with Recursion (Pure Function with Helper)
    // Time Complexity: O(log10(n))
    // Space Complexity: O(log10(n)) (Recursive Call Stack)
    static int reverse2(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int lastDigit = n % 10;
        return lastDigit * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

}
