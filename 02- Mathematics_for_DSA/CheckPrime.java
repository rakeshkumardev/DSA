public class CheckPrime {
    public static void main(String[] args) {
        // CheckPrime.checkPrime(3);
        // System.out.println(CheckPrime.checkPrimeOpt(79));
        System.out.println(CheckPrime.checkPrimeOpt2(79));

    }

    // ==============================================================================
    // 1. Brute-Force Approach
    // Time Complexity: O(n)
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static boolean checkPrime(int n) {
        // if (n == 0 || n == 1)
        // return false;
        if (n <= 1)
            return false;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 2;// This is the main who is checking the prime (1, n) only two no's can be factor
                          // na of a prime number so that's the whole thing
    }

    // ==============================================================================
    // 2. Optimal Approach 1: Count Factors up to sqrt(n)
    // Time Complexity: O(sqrt(n))
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static boolean checkPrimeOpt(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (n / i != i) {
                    count++;
                }
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    // ==============================================================================
    // 3. Optimal Approach 2: Early Exit up to sqrt(n) (Most Efficient)
    // Time Complexity:
    // - Worst Case: O(sqrt(n)) -> When n is prime, no factor divides n, so loop
    // runs completely until i > sqrt(n).
    // - Best Case: O(1) -> When n is an even number > 2 (e.g., 4, 6, 8...),
    // it exits on the first check (i = 2).
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static boolean checkPrimeOpt2(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
