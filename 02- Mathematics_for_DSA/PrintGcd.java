public class PrintGcd {
    public static void main(String[] args) {
        System.out.println(PrintGcd.printGcd(48, 18));
    }

    // ==============================================================================
    // 1. Brute-Force Approach 1 (Forward)
    // Time Complexity: O(min(a, b))
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static int printGcd(int a, int b) {
        int gcd = 1; // Base - Case (because 1 divides every integer)
        int limit = Math.min(a, b);
        for (int i = 1; i <= limit; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    // ==============================================================================
    // 2. Brute-Force Approach 2 (Backward)
    // Time Complexity:
    //   - Worst Case: O(min(a, b))
    //   - Best Case:  O(1)
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static int printGcd2(int a, int b) {
        int gcd = 1;
        int limit = Math.min(a, b);
        for (int i = limit; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return gcd;
    }

    // ==============================================================================
    // 3. Optimal Approach 1 : Iterative Euclidean Algorithm
    // Time Complexity: O(log(min(a, b)))
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static int printGcdOpt(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        if (a == 0) {
            return b;
        }
        return a;
    }

    // ==============================================================================
    // 4. Optimal Approach 2 : Recursive Euclidean Algorithm
    // Time Complexity: O(log(min(a, b)))
    // Space Complexity: O(log(min(a, b))) (Recursive Call Stack)
    static int printGcdRecOpt2(int a, int b) {
        if (b == 0) {
            return a;
        }
        return printGcdRecOpt2(b, a % b);
    }

}
