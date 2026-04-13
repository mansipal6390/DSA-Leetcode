class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int mindiff = Integer.MAX_VALUE;
        for(int i= 0 ; i<nums.length; i++){
            int diff = Math.abs(start-i);
            if(nums[i]==target&& diff< mindiff ){
                mindiff = diff;
            }
        }
        return mindiff;
    }
}