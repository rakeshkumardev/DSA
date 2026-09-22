public class BinaryExponentiation {
    public static void main(String[] args) {
        System.out.println(BinaryExponentiation.myPow(2.0, 4));
        System.out.println(BinaryExponentiation.myPowOptIter(2.0, 4));
        System.out.println(BinaryExponentiation.myPowOptRec(2.0, 4));
    }

    // ==============================================================================
    // 1. Brute-Force Approach
    // Time Complexity: O(n)
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static double myPow(double x, int n) {
        long power = n;
        if (power < 0) {
            power = -power;
            x = 1.0 / x;
        }

        double result = 1.0;
        for (long i = 0; i < power; i++) {
            result = result * x;
        }
        return result;
    }

    // ==============================================================================
    // 2. Optimal Approach - Iterative
    // Time Complexity: O(log2(n))
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static double myPowOptIter(double x, int n) {
        long power = n;
        if (power < 0) {
            power = -power;
            x = 1.0 / x;
        }

        double result = 1.0;
        while (power > 0) {
            if (power % 2 == 1) {
                result = result * x;
                power = power - 1;
            } else {
                x = x * x;
                power = power / 2;
            }
        }
        return result;
    }

    // ==============================================================================
    // 3. Optimal Approach - Recursive (with Helper Function)
    // Time Complexity: O(log2(n))
    // Space Complexity: O(log2(n)) (Recursive Call Stack)
    static double myPowOptRec(double x, int n) {
        long power = n;
        if (power < 0) {
            x = 1.0 / x;
            power = -power;
        }

        return fastPowerHelper(x, power);
    }

    static double fastPowerHelper(double x, long n) {
        if (n == 0) {
            return 1.0;
        }

        if (n % 2 == 0) {
            return fastPowerHelper(x * x, n / 2);
        } else {
            return x * fastPowerHelper(x * x, n / 2);
        }
    }

}
