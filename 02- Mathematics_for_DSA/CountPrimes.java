import java.util.Arrays;

public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(CountPrimes.countPrimes(98));
        System.out.println(CountPrimes.countPrimesOpt(50));
    }

    // ==============================================================================
    // 1. Brute-Force Approach (Using isPrime Helper)
    // Time Complexity: O(n * sqrt(n))
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int countPrimes(int n) {
        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i) == true) {
                count++;
            }
        }
        return count;
    }

    // ==============================================================================
    // 2. Optimal Approach (Sieve of Eratosthenes)
    // Time Complexity: O(n * log(log(n)))
    // Space Complexity: O(n) (Auxiliary Space for boolean array)
    static int countPrimesOpt(int n) {
        if (n <= 1) {
            return 0;
        }
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i] == true) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i] == true) {
                count++;
            }
        }
        return count;
    }

}
