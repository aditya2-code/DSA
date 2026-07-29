class Solution {

    static final long MOD = 1000000007L;

    public int countGoodNumbers(long n) {

        long even = (n + 1) / 2;
        long odd = n / 2;

        long result = (power(5, even) * power(4, odd)) % MOD;

        return (int) result;
    }

    public long power(long a, long b) {

        if (b == 0)
            return 1;

        if (b % 2 == 0)
            return power((a * a) % MOD, b / 2);

        return (a * power((a * a) % MOD, (b - 1) / 2)) % MOD;
    }
}