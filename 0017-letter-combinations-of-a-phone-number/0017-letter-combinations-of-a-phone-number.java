class Solution {
    static String map [] = {"" , "" , "abc", "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" ,"wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        solve(digits , "" , list);
        return list;

        
    }
    public void solve(String digits , String ans , List<String> list){
       if(digits.length()==0){
            list.add(ans);
            return;
        }
        char ch = digits.charAt(0);

        int nums = ch-'0';
        String press = map[nums];
        for(int i = 0 ; i<press.length() ; i++){
            solve(digits.substring(1) , ans+press.charAt(i) ,list);
        }
    }
}