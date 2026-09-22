public class ReverseNum {
    static int sum = 0; // reverse1 Method part

    public static void main(String[] args) {
        ReverseNum.reverse1(1234);
        System.out.println(sum);
        System.out.println(ReverseNum.reverse2(4321));
    }

    // Reverse Number with recursion : Brute-Force Approach
    static void reverse1(int n) {
        if (n == 0) {
            return;
        }
        int lastdigit = n % 10;
        sum = sum * 10 + lastdigit;
        reverse1(n / 10);
    }

    // Reverse Number with recursion second method :
    static int reverse2(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int lastDigit = n % 10;
        return lastDigit * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

}
