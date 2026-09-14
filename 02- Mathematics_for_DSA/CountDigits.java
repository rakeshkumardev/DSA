public class CountDigits {
    public static void main(String[] args) {
        // System.out.println(Countdigits.countDigits(28));
        System.out.println(CountDigits.optimizeCountDigits(280));

    }

    // ==============================================================================
    // 1. Brute-Force Method
    // Time Complexity: O(log10(n))
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static int countDigits(int n) {
        if (n == 0)
            return 1;
        int count = 0;

        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;

    }

    // ==============================================================================
    // 2. Optimized Approach (Formula)
    // Time Complexity: O(1)
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static int optimizeCountDigits(int n) {
        if (n == 0)
            return 1;
        return (int) Math.floor(Math.log10(n)) + 1; // This is the formula and to understand this you should know the
                                                    // concept of log , log10
    }

}
