class Solution {
    public int change(int amount, int[] coins) {
        int dp [][] = new int [amount+1][coins.length];

        for(int a[]:dp){
            Arrays.fill(a , -1);
        }
       return solve(amount , coins, 0 , dp);
        
    }
    public int solve(int amount , int coins[] , int i , int dp[][]){
        if(amount==0){
            return 1;
        }
        if(i == coins.length){
            return 0;
        }

        if(dp[amount][i]!=-1){
            return dp[amount][i];
        }
        int pick = 0;
        int not_pick = 0;
        if(amount >=coins[i]){
       pick = solve(amount-coins[i], coins , i , dp);
        }
        not_pick = solve(amount, coins , i +1,  dp);
        return dp[amount][i] =  pick + not_pick;
    }
}