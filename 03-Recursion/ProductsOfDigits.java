public class ProductsOfDigits {
    public static void main(String[] args) {
        System.out.println(ProductsOfDigits.productsOfDigits(93));
    }

    // ==============================================================================
    // Product of Digits using Recursion
    // Time Complexity: O(log10(n))
    // Space Complexity: O(log10(n)) (Recursive Call Stack)
    static int productsOfDigits(int n) {
        if (n % 10 == n) {
            return n;
        }

        return (n % 10 * productsOfDigits(n / 10));
    }

}
