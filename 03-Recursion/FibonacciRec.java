public class FibonacciRec {
    public static void main(String[] args) {
        System.out.println(FibonacciRec.fibonacciRec(6));
    }

    // ==============================================================================
    // Recursive Fibonacci
    // Time Complexity: O(2^n)
    // Space Complexity: O(n) (Recursive Call Stack)
    static int fibonacciRec(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    }

}
