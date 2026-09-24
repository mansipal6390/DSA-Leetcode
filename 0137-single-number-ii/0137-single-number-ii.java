class Solution {
    public int singleNumber(int[] nums) {
       int target = 0;
       int sum = 0;
        for (int n : nums){
            target  = (target^n) &~ sum;
            sum  = (sum^n)& ~ target;
        }
        return target;
    }
}