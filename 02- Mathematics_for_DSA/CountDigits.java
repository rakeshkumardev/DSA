
public class CountDigits {
    public static void main(String[] args) {
        // System.out.println(Countdigits.countDigits(28));
        System.out.println(CountDigits.optimizeCountDigits(280));

    }

    // Brute-Force Method
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

    // Optimized one with the formula
    static int optimizeCountDigits(int n) {
        if (n == 0)
            return 1;
        return (int) Math.floor(Math.log10(n)) + 1; // This is the formula and to understand this you should know the
                                                    // concept of log , log10
    }

}
