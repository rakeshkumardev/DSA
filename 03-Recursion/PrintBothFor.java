public class PrintBothFor {
    public static void main(String[] args) {
        PrintBothFor.printBothFor(1, 9);
    }

    // ==============================================================================
    // Print 1 to N and N to 1 using Recursion
    // Time Complexity: O(n)
    // Space Complexity: O(n) (Recursive Call Stack)
    static void printBothFor(int i, int n) {
        if (i > n) {// Base case
            return;
        }
        System.out.println(i);
        printBothFor(i + 1, n);
        System.out.println(i);
    }

}
