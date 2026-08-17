class Solution {
    public int singleNumber(int[] nums) {
        int target=0;

        for(int x:nums){
            target ^=x;
        }
        return target;
    }
}