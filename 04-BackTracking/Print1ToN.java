public class Print1ToN {
    public static void main(String[] args) {
        Print1ToN.print1ToN(9);
    }

    // the basic code one
    static void print1ToN(int n) {
        if (n == 0) {
            return;
        }
        print1ToN(n - 1);
        System.out.println(n);
    }
}
