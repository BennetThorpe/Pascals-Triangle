public class Pascal {

    public long pascalRowSumIterative(int n) {
        if (n < 0) throw new IllegalArgumentException("Cannot be a negative #!!!");

        // The nth row has n+1 elements: C(n,n)
        long[] row = new long[n+1];
        row[0] = 1; // first number of each row is 1

        long sum = 1; // base case sum

        // C(n, k) = C(n, k-1) * (n-k+1) / k
        for (int k = 1; k <= n; k++) {
            row[k] = row[k-1] * (n-k+1) / k;
            sum += row[k]; // running sum
        }

        return sum;
    }

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
