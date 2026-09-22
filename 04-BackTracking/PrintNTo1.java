public class PrintNTo1 {
    public static void main(String[] args) {
        PrintNTo1.printNTo1(1, 5);
    }

    // ==============================================================================
    // Print N to 1 using Backtracking (incrementing i, printing on return)
    // Time Complexity: O(n)
    // Space Complexity: O(n) (Recursive Call Stack)
    static void printNTo1(int i, int n) {
        if (i > n) {
            return;
        }

        printNTo1(i + 1, n);
        System.out.println(i);
    }

}
