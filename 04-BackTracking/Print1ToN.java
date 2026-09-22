public class Print1ToN {
    public static void main(String[] args) {
        Print1ToN.print1ToN(9);
    }

    // ==============================================================================
    // Print 1 to N using Backtracking
    // Time Complexity: O(n)
    // Space Complexity: O(n) (Recursive Call Stack)
    static void print1ToN(int n) {
        if (n == 0) {
            return;
        }
        print1ToN(n - 1);
        System.out.println(n);
    }
}
