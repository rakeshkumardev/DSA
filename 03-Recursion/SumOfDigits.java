public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(SumOfDigits.sumOfDigitRec(11272));
        System.out.println(SumOfDigits.sumOfDigitIter(1342));
    }

    // Print Sum of Digits of Number N by Using Recursion
    static int sumOfDigitRec(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigitRec(n / 10);
    }

    // Print Sum Of Digits of Number N by iterative method
    static int sumOfDigitIter(int n) {
        if (n == 0) {
            return 0;
        }
        int sum = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        return sum;

    }

}
