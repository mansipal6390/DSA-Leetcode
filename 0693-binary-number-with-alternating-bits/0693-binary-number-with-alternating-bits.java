class Solution {
    public boolean hasAlternatingBits(int n) {
    String nums = Integer.toBinaryString(n);
    for(int i =0; i<nums.length()-1; i++){
        if(nums.charAt(i)==nums.charAt(i+1)){
            return false;
        }
       
    }
     return true;
    }
}