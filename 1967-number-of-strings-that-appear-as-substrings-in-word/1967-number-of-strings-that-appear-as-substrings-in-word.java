class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0; 

        for(String n : patterns){
            if(word.contains(n)){
                count++;
            }
        }
        return count ;
        
    }
}

