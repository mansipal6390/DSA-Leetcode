class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;

        for(int a :nums){
            sum += a;
        }
        if (sum%2 !=0){
            return false;
        }
         
      return subsetsum(nums, sum/2);
        
    }
    public boolean subsetsum(int nums[] , int sum){
        Boolean dp [][] = new Boolean[nums.length][sum+1];
         return solve(nums,sum, 0 , dp);
    
    }
    public  static boolean solve( int nums[] , int sum  , int i , Boolean dp[][] ){
       
        
        if(sum ==0){
            return true;
        }
        
        if( i == nums.length){
            return false;
        }
        
        boolean take = false;
        boolean not_take = false;
        if(dp[i][sum]!=null){
            return dp[i][sum];
        }
        // take 
        
        if(nums[i]<=sum){
            take = solve(nums , sum-nums[i] , i+1 , dp);
        }
        //not take 
        not_take = solve(nums , sum , i+1 , dp);
        return  dp[i][sum] =take || not_take;
    

    }
}