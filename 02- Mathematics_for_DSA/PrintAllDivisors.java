public class PrintAllDivisors {
    public static void main(String[] args) {
        // PrintAllDivisors.printAllDivisors(8);
        // PrintAllDivisors.printAllDivisorsOpt(8);
        PrintAllDivisors.printAllDivisorsOpt2(100);
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
    static void printAllDivisorsOpt(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(i);
                if (n / i != i) {
                    System.out.println(n / i);
                }
            }
        }
    }

    // Optimized Approach ( Math.sqrt == i*i <= n)
    static void printAllDivisorsOpt2(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                if (n / i != i) {
                    System.out.println(n / i);
                }
            }
        }
    }
}
