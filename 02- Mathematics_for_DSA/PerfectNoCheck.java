public class PerfectNoCheck {
    public static void main(String[] args) {
        System.out.println(PerfectNoCheck.perfectNoCheck(6));
    }

    // Brute-Force Method : checkPerfectNo
    static boolean perfectNoCheck(int n) {
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return sum == n;

    }
}
