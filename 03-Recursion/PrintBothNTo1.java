public class PrintBothNTo1 {
    public static void main(String[] args) {
        PrintBothNTo1.printBothRev(5);
    }

    static void printBothRev(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);

        printBothRev(n - 1);

        System.out.println(n);
    }

}
