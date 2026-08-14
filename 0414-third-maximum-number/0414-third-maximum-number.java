class Solution {
    public int thirdMax(int[] nums) {
        Long a = null, b = null, c = null;

        for (int x : nums) {
            long n = x;

            if (a != null && n == a || b != null && n == b || c != null && n == c)
                continue;

            if (a == null || n > a) {
                c = b;
                b = a;
                a = n;
            } else if (b == null || n > b) {
                c = b;
                b = n;
            } else if (c == null || n > c) {
                c = n;
            }
        }

        return c == null ? a.intValue() : c.intValue();
    }
}