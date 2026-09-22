public class OddDigitCount {
    public static void main(String[] args) {
        System.out.println(OddDigitCount.oddDigitCount(3333));
    }

    // ==============================================================================
    // Time Complexity: O(log10(n))
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static int oddDigitCount(int n) {
        int count = 0;
        while (n > 0) {
            int lastDigit = n % 10;

            if (lastDigit % 2 != 0) {// here the lasDigit or n both fits well means if you put n in the if condition
                                     // then also the answer going to come correct as the below n = n / 10 ddoing the
                                     // main stuff
                count++;
            }
            n = n / 10;
        }

        return count;
    }

}
