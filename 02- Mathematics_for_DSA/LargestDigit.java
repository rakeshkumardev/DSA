public class LargestDigit {
    public static void main(String[] args) {

    }

    static int largestDigit(int n) {
        int lastDigit;
        int maxDigit = 0;
        while (n != 0) {
            lastDigit = n % 10;
            if (lastDigit > maxDigit) {
                maxDigit = lastDigit;

            }

            if (maxDigit == 9) { // E.g. n = 4823193. is it possible for any of the remaining digits ( 48231) to
                                 // be larger than 9.
                return 9;
            }

            n = n / 10;
        }
        return maxDigit;
    }

}
