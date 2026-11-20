class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
       
        for(int i = 1; i<=9 ; i++){
         solve(n , i, ans);
        }
        return ans;
        
    }
    public void solve(int n , int curr , List<Integer>ans){

        //best case 
        if(curr>n){
            return ;
        }
        ans.add(curr);
        for(int i = 0; i<=9 ; i++){
            solve( n , curr*10+i , ans);
        }
    }
}