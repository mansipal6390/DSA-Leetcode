class Solution {
    public long minCost(int[] nums) {
        int n = nums.length;
        long ans = nums[0] + nums[n-1];

        List<Integer> list = new ArrayList<>();

        for(int i = 1; i<n-1; i++){
            list.add(nums[i]);
        }
        Collections.sort(list);

        int i = 1;
        while(i<list.size()){
            ans = Math.min(ans , ans + list.get(i)+list.get(i-1));
            i+=2;
        }
        
        return ans;
    }
}