public class FastPowerxn {
    public static void main(String[] args) {
        System.out.println(FastPowerxn.myPow(2.0, 4));
    }

    // ==============================================================================
    // Fast Power x^n (Recursive with Helper Function)
    // Time Complexity: O(log2(n))
    // Space Complexity: O(log2(n)) (Recursive Call Stack)
    static double myPow(double x, int n) {
        long power = n;

        if (power < 0) {
            power = -power;
            x = 1.0 / x;
        }

        return fastPowerHelper(x, power);
    }

    static double fastPowerHelper(double x, long n) {
        if (n == 0)
            return 1.0;

        if (n % 2 == 0) {
            return fastPowerHelper(x * x, n / 2);
        } else {
            return x * fastPowerHelper(x * x, n / 2);
        }
    }

}
