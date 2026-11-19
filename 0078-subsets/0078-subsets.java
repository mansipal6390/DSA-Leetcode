class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> list = new ArrayList<>();
       List<Integer> ll = new ArrayList<>();
       solve(nums , 0 , list ,ll);
       return list;

        
    }
    public void solve(int nums[] , int i , List<List<Integer>> list , List<Integer>ll){

        if(i ==nums.length){
            list.add(ll);
            return ;
        }
        //not take 
        solve(nums , i+1 , list , new ArrayList<>(ll));
        //take
        int ele = nums[i];
        ll.add(ele);
        solve(nums , i+1 , list ,new ArrayList<>(ll));
    }
}