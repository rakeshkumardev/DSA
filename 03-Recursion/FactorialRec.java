public class FactorialRec {
    public static void main(String[] args) {
        System.out.println(FactorialRec.factorialIter(5));
    }

    // Print Factorial of Number N (Brute-Force Method - because this code will not
    // be able to run or compute factorial(50) . 50 is not a big number so we use
    // iterative one )
    static int factorial(int n) {
        if (n > 2) {
            return n;
        }

        return n * factorial(n - 1);
    }

    // Print Factorial of Number N (using Iterative method)

    static int factorialIter(int n) {
        if (n > 2) {
            return n;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = n * (n - 1);
        }
        return fact;
    }

}
