class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
         backtracker(ans , "" , 0, 0 ,n);
        return ans;
    }

    void backtracker(List<String> ans, String curr , int open , int close , int n){
             if (curr.length() == 2*n){
                ans.add(curr);
                return ;
             }
    
        if(open <n){
            backtracker(ans , curr +"(" , open+1, close , n);
        }
        if(open>close){
            backtracker(ans , curr+ ")" , open , close+1 , n);
        }
     
    }
    
        
    
}