public class CheckPrime {
    public static void main(String[] args) {
        CheckPrime.checkPrime(3);
    }
    //Brute-Force Method/approach
    static boolean checkPrime(int n) {
        // if (n == 0 || n == 1)
        // return false;
        if (n <= 1)
            return false;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 2;// This is the main who is checking the prime (1, n) only two no's can be factor
                          // na of a prime number so that's the whole thing
    }

    static 

}
