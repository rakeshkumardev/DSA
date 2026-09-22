public class LargestDigit {
    public static void main(String[] args) {
        System.out.println(LargestDigit.largestDigit(5824));
        System.out.println(LargestDigit.largestDigit(4823193));
    }

    // ==============================================================================
    // Time Complexity:
    //   - Best Case:  O(1) -> When the last digit is 9, it exits on the first iteration
    //   - Worst Case: O(log10(n)) -> When there is no 9, or 9 is the leftmost digit
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static int largestDigit(int n) {
        n = Math.abs(n);
        int lastDigit;
        int maxDigit = 0;

        while (n != 0) {
            lastDigit = n % 10;
            if (lastDigit > maxDigit) {
                maxDigit = lastDigit;
            }

            if (maxDigit == 9) { // E.g. n = 4823193. No digit can be larger than 9
                return 9;
            }

            n = n / 10;
        }
        return maxDigit;
    }

}
