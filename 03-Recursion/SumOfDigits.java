public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(SumOfDigits.sumOfDigitRec(11272));
        System.out.println(SumOfDigits.sumOfDigitIter(1342));
    }

    // ==============================================================================
    // 1. Sum of Digits using Recursion
    // Time Complexity: O(log10(n))
    // Space Complexity: O(log10(n)) (Recursive Call Stack)
    static int sumOfDigitRec(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigitRec(n / 10);
    }

    // ==============================================================================
    // 2. Sum Of Digits using Iterative Method
    // Time Complexity: O(log10(n))
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static int sumOfDigitIter(int n) {
        if (n == 0) {
            return 0;
        }
        int sum = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        return sum;
    }

}
