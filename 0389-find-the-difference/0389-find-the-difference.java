class Solution {
    public char findTheDifference(String s, String t) {
        int rem = 0;
         
        for(char c : s.toCharArray()){
            rem^=c;
        }
        
       for(char c:t.toCharArray()){
        rem ^=c;
       }
        return (char)rem;
    }
}