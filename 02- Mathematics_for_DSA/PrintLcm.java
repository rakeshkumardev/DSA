public class PrintLcm {
    public static void main(String[] args) {
        System.out.println(PrintLcm.printLcm(4, 6));
        System.out.println(PrintLcm.PrintLcmOpt(4, 6));
    }

    // ==============================================================================
    // 1. Brute-Force Method
    // Time Complexity: O(a * b)
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static int printLcm(int a, int b) {
        // Why start from Math.max(a, b)?
        // Can the LCM of 4 and 6 be 1, 2, 3, 4,or 5?
        // No! Because any multiple of 6 must be at least 6 (6 * 1 = 6).
        // Therefore, the answer cannot be smaller than the largest number. Starting at
        // Math.max(a, b) saves useless checks!
        int res = Math.max(a, b);

        while (true) {
            if (res % a == 0 && res % b == 0) {
                return res;
            }
            res++;
        }
    }

    // ==============================================================================
    // Helper Method: Iterative Euclidean Algorithm for GCD
    // Time Complexity: O(log(min(a, b)))
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static int gcdprint(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        } else {
            return a;
        }
    }

    // ==============================================================================
    // 2. Optimized Approach (Using GCD-LCM Formula: a * b = GCD(a, b) * LCM(a, b))
    // Time Complexity: O(log(min(a, b)))
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static int PrintLcmOpt(int a, int b) {
        int gcd = gcdprint(a, b);
        return (a * b) / gcd; // either (a / gcd) * b;
    }

}
