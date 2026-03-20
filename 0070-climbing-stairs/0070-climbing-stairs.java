class Solution {
    public int climbStairs(int n) {
        
        if(n<=3){
            return n;
        }
        int m = 1;
        int k = 2;

        for( int i = 3; i<=n; i++){
            int curr = m + k;

            m = k;
            k = curr;


        }
        return k;
         
    }

}