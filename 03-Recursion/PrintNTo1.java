public class PrintNTo1 {
    public static void main(String[] args) {
        PrintNTo1.printNTo12(5, 5);
        PrintNTo1.printNTo1(5);
    }

    // Print N to 1 using simple Recursion
    static void printNTo1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNTo1(n - 1);
    }

    // print N To 1 using two variables
    static void printNTo12(int i, int n) {
        if (i < 1) {
            return;
        }
        System.out.println(i);
        printNTo12(i - 1, n);
    }

}
