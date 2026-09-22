public class Print1ToN {
    public static void main(String[] args) {
        Print1ToN.print1ToN(5);
        Print1ToN.print1ToN2(1, 3);
    }

    // ==============================================================================
    // 1. Print 1 To N using Backtracking / Head Recursion
    // Time Complexity: O(n)
    // Space Complexity: O(n) (Recursive Call Stack)
    static void print1ToN(int n) {
        if (n == 0) {
            return;
        }
        print1ToN(n - 1);
        System.out.println(n);
    }

    // ==============================================================================
    // 2. Print 1 To N using Simple Forward Recursion
    // Time Complexity: O(n)
    // Space Complexity: O(n) (Recursive Call Stack)
    static void print1ToN2(int i, int n) {
        if (i > n) {
            return;
        }

        System.out.println(i);
        print1ToN2(i + 1, n);
    }
}
