public class SumOfNNaturalNo {
    public static void main(String[] args) {
        // System.out.println(SumOfNNaturalNo.sumOfNNaturalNo(9));
        System.out.println(SumOfNNaturalNo.sumOfNNaturalNoIter(9));

    }

    // print the Sum Of N Natural Numbers :
    static int sumOfNNaturalNo(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfNNaturalNo(n - 1);
    }

    // Print the Sum of N Natural Numbers with Iteration :
    static int sumOfNNaturalNoIter(int n) {
        if (n == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // or sum = sum + i;
        }
        return sum;
    }
}
