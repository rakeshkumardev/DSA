public class CountZeros {
    public static void main(String[] args) {
        System.out.println(CountZeros.countZeros(10091));
        System.out.println(CountZeros.countZerosRec(10091));
    }

    // ==============================================================================
    // 1. Iterative Approach
    // Time Complexity: O(log10(n))
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static int countZeros(int n) {
        if (n == 0) {
            return 1;
        }

        int count = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit == 0) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    // ==============================================================================
    // 2. Recursive Approach (with Helper Function)
    // Time Complexity: O(log10(n))
    // Space Complexity: O(log10(n)) (Recursive Call Stack)
    static int countZerosRec(int n) {
        if (n == 0) {
            return 1;
        }
        return countZerosHelper(n, 0);
    }

    static int countZerosHelper(int n, int count) {
        if (n == 0) {
            return count;
        }

        int lastDigit = n % 10;
        if (lastDigit == 0) {
            return countZerosHelper(n / 10, count + 1);
        }
        return countZerosHelper(n / 10, count);
    }

}
