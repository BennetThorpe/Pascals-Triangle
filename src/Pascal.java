public class Pascal {

    // big O = O(n^2)
    // Big O space: O(n)
    public long pascalRowSumIterative(int n) {
        if (n < 0) throw new IllegalArgumentException("Cannot be a negative #!!!");

        long[] prev = {1};

        for (int i = 1; i <= n; i++) {
            long[] curr = new long[i + 1];
            curr[0] = 1; // left edge
            curr[i] = 1; // right edge

            for (int k = 1; k < i; k++) {
                curr[k] = prev[k-1] + prev[k]; // C(n-1,k-1) + C(n-1,k)
            }

            prev = curr;
        }

        // sum the final row
        long sum = 0;
        for (long val : prev) {
            sum += val;
        }

        return sum;
    }

    // Big O Time: O(2^n)
    // Big O space: O(n)
    public long pascalRowSumRecursive(int n) {
        return pascalHelper(n, 0);
    }

    private static long binomialCoefficient(int n, int k) {
        if (k == 0|| k == n) return 1;

        // C(n, k) = C(n-1, k-1) + C(n-1, k)
        return binomialCoefficient(n-1, k-1) + binomialCoefficient(n-1, k);
    }

    private static long pascalHelper(int n, int k) {
        if (k > n) return 0;

        // Sum(n) = C(n,k) + Sum(n,k+1)
        return binomialCoefficient(n, k) + pascalHelper(n, k+1);
    }

}
