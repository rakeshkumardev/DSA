public class PrintPrimes {
    public static void main(String[] args) {

    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;

        }
        return true;

    }

    static void printPrimes(int n){
        if (n )

    }

}
