public class SumOfNNaturalNo {
    public static void main(String[] args) {
        System.out.println(SumOfNNaturalNo.sumOfNNaturalNo(9));
        System.out.println(SumOfNNaturalNo.sumOfNNaturalNoIter(9));
    }

    // ==============================================================================
    // 1. Sum Of N Natural Numbers using Recursion
    // Time Complexity: O(n)
    // Space Complexity: O(n) (Recursive Call Stack)
    static int sumOfNNaturalNo(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfNNaturalNo(n - 1);
    }

    // ==============================================================================
    // 2. Sum of N Natural Numbers with Iteration
    // Time Complexity: O(n)
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static int sumOfNNaturalNoIter(int n) {
        if (n == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
