public class PrimeFactorization {
    public static void main(String[] args) {
        PrimeFactorization.primeFactorization(18);
        PrimeFactorization.primeFactorizationOpt(18);
    }

    // ==============================================================================
    // 1. Brute-Force Approach
    // Time Complexity: O(n)
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static void primeFactorization(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
    }

    // ==============================================================================
    // 2. Optimal Approach
    // Time Complexity: O(sqrt(n))
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static void primeFactorizationOpt(int n) {
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        if (n > 1) {
            System.out.print(n);
        }
    }

}
