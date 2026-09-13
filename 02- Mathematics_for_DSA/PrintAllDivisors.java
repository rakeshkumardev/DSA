public class PrintAllDivisors {
    public static void main(String[] args) {
        PrintAllDivisors.printAllDivisors(8);
    }

    // Brute-Force Approach
    static void printAllDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    // Optimized Approach
    static int printAllDivisorsOpt(int n) {

    }
}
