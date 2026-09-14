public class ArmstrongNum {
    public static void main(String[] args) {
        System.out.println(ArmstrongNum.armstrongNum(1634));
    }

    // ==============================================================================
    // 1. Brute-Force Method
    // Time Complexity: O(log10(n))
    // Space Complexity: O(1) (Constant Auxiliary Space)
    static boolean armstrongNum(int n) {
        if (n == 0)
            return true;
        int orignalNum = n; // Save a copy of orignal number , to compare it later
        int sum = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            sum = sum + (lastDigit * lastDigit * lastDigit);
            n = n / 10;
        }
        return orignalNum == sum;
    }
}
