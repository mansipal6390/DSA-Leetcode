class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int ans = nums[0];
        Arrays.sort(nums);

        for(int i = 1; i<=n ; i++){
            if(nums[i-1]==nums[i]){
                ans=nums[i];
                break;
             
            }

        }

      return ans;
        
    }
}