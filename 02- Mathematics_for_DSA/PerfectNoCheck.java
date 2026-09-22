public class PerfectNoCheck {
    public static void main(String[] args) {
        System.out.println(PerfectNoCheck.perfectNoCheck(6));
        System.out.println(PerfectNoCheck.perfectNoCheckOpt(28));
    }

    // ==============================================================================
    // 1. Brute-Force Method
    // Time Complexity: O(n)
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static boolean perfectNoCheck(int n) {
        if (n <= 1) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return sum == n;
    }

    // ==============================================================================
    // 2. Optimized Method (Checking factors up to sqrt(n))
    // Time Complexity: O(sqrt(n))
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static boolean perfectNoCheckOpt(int n) {
        if (n <= 1) {
            return false;
        }

        int sum = 1; // 1 is always a proper divisor for any n > 1

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i;
                if (i * i != n) {
                    sum = sum + (n / i);
                }
            }
        }

        return sum == n;
    }
}
