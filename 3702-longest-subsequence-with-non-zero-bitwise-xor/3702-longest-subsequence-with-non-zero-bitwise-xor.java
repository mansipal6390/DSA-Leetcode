class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int xor = 0;
        boolean value = false;

        for(int x: nums){
         xor = xor^x;


          if(x !=0){
          value = true;
          }
        }

        if(xor!=0){
            return n;
        }
       
        
  
     
        return value? n-1 : 0;
    }
}