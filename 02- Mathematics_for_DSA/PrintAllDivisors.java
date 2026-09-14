public class PrintAllDivisors {
    public static void main(String[] args) {
        // PrintAllDivisors.printAllDivisors(8);
        // PrintAllDivisors.printAllDivisorsOpt(8);
        PrintAllDivisors.printAllDivisorsOpt2(100);
    }

    // ==============================================================================
    // 1. Brute-Force Approach
    // Time Complexity: O(n)
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static void printAllDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    // ==============================================================================
    // 2. Optimized Approach (Using Math.sqrt)
    // Time Complexity: O(sqrt(n))
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static void printAllDivisorsOpt(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(i);
                if (n / i != i) {
                    System.out.println(n / i);
                }
            }
        }
    }

    // ==============================================================================
    // 3. Optimized Approach (Using i * i <= n)
    // Time Complexity: O(sqrt(n))
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static void printAllDivisorsOpt2(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                if (n / i != i) {
                    System.out.println(n / i);
                }
            }
        }
    }
}
