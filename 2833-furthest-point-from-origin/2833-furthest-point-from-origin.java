class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int L = 0, R = 0, blank = 0;

        for(char ch : moves.toCharArray()) {
            if(ch == 'L') L++;
            else if(ch == 'R') R++;
            else blank++;
        }

        int option1 = R + blank - L; 
        int option2 = L + blank - R; 

        return Math.max(Math.abs(option1), Math.abs(option2));
    }
}