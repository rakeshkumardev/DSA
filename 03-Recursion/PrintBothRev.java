public class PrintBothRev {
    public static void main(String[] args) {
        PrintBothRev.printBothRev(5);
    }

    // ==============================================================================
    // Print N to 1 and 1 to N using Recursion
    // Time Complexity: O(n)
    // Space Complexity: O(n) (Recursive Call Stack)
    static void printBothRev(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);

        printBothRev(n - 1);

        System.out.println(n);
    }

}
