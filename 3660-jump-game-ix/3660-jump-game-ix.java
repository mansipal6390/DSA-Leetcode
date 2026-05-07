class Solution {
    public int[] maxValue(int[] nums) {

        int n = nums.length;

        int[] suffixMin = new int[n];
        suffixMin[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
        }

        int[] ans = new int[n];

        int start = 0;
        int currentMax = nums[0];

        for (int i = 0; i < n; i++) {

            currentMax = Math.max(currentMax, nums[i]);

           
            if (i == n - 1 || currentMax <= suffixMin[i + 1]) {

                for (int j = start; j <= i; j++) {
                    ans[j] = currentMax;
                }

                start = i + 1;

                if (start < n) {
                    currentMax = nums[start];
                }
            }
        }

        return ans;
    }
}