public class FactorialRec {
    public static void main(String[] args) {
        System.out.println(FactorialRec.factorial(5));
        System.out.println(FactorialRec.factorialIter(5));
    }

    // ==============================================================================
    // 1. Recursive Approach
    // Time Complexity: O(n)
    // Space Complexity: O(n) (Recursive Call Stack)
    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    // ==============================================================================
    // 2. Iterative Approach
    // Time Complexity: O(n)
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static int factorialIter(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

}
