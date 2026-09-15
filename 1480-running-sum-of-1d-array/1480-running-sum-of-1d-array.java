class Solution {
    public int[] runningSum(int[] nums) {
        // int [] results = new int[nums.length];
        // results[0] = nums[0];

        // for(int i = 1; i<nums.length; i++){
        //     results[i] = results[i-1]+nums[i];  //prefix methods
        // }
        // return results ;
        int []sum = new int[nums.length];
     for(int i = 0 ; i<nums.length ; i++){
        int ans =0;
        for(int j = 0 ; j<=i ; j++){
            ans += nums[j];
        }
        sum[i] = ans;
     }
     return sum;

    }
}