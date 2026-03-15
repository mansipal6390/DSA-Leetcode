class Solution {
    public long countCommas(long n) {
        long commas = 0;
        long start = 1000;
        int commaCount = 1;

        while (start <= n) {
            long end = start * 1000 - 1;
            long numbers = Math.min(n, end) - start + 1;
            commas += numbers * commaCount;

            start *= 1000;
            commaCount++;
        }

        return commas;
    }
}