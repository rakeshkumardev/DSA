public class PrimeFactorization {
    public static void main(String[] args) {
        PrimeFactorization.primeFactorization(18);
        PrimeFactorization.primeFactorization(18);
    }

    // ========================
    // Brute-Force Approach
    static void primeFactorization(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
    }

    // ==================
    // Optimal-Approach

    static void primeFactorizationOpt(int n ){

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
