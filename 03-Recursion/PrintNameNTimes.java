public class PrintNameNTimes {
    public static void main(String[] args) {
        PrintNameNTimes.printNameNTimes(5, "Java");
    }

    // ==============================================================================
    // Print Name N Times using Recursion
    // Time Complexity: O(n)
    // Space Complexity: O(n) (Recursive Call Stack)
    static void printNameNTimes(int n, String name) {
        if (n == 0) {
            return;
        }

        System.out.println(name);
        printNameNTimes(n - 1, name);
    }

}
