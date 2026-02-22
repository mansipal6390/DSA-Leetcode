class Solution {
    public int binaryGap(int n) {
        int prev = -1;
        int max = 0;

        for(int i = 0; i<32; i++){
            if((n&1)>0){
                if(prev ==-1){
                    prev = i;
                }else{
                    max = Math.max(i-prev, max);
                    prev =i;
                }
            }
            n = n>>1;
        }
       return max;
    }
}