public class EuclideanRec {
    public static void main(String[] args) {
        System.out.println(EuclideanRec.printGcd(45, 15));
    }

    // ==============================================================================
    // Recursive Euclidean Algorithm for GCD
    // Time Complexity: O(log(min(a, b)))
    // Space Complexity: O(log(min(a, b))) (Recursive Call Stack)
    static int printGcd(int a, int b) {
        if (b == 0)
            return a;

        return printGcd(b, a % b);
    }

}
