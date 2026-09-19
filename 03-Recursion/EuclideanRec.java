public class EuclideanRec {
    public static void main(String[] args) {
        System.out.println(EuclideanRec.printGcd(45, 15));
    }

    // find the Greatest common Divisor(GCD) of two numbers using the optimized
    // recursive Euclidean Algorithm
    static int printGcd(int a, int b) {
        if (b == 0)
            return a;

        return printGcd(b, a % b);
    }

}
