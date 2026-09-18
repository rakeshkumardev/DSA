public class PrintNameNTimes {
    public static void main(String[] args) {

    }

    // Given a name , and the number n , print the name exactly n times
    static void printNameNTimes(int n, String name) {
        if (n == 0) {
            return;
        }

        System.out.println(name);
        printNameNTimes(n - 1, name);

    }

}
