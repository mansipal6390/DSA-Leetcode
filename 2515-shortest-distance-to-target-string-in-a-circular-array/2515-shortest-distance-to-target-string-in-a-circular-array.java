class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int result = Integer.MAX_VALUE;
        


        for(int i = 0 ; i<n; i++){
            if(words[i].equals(target)){
                int straight = Math.abs(i - startIndex);
                int all = Math.min( straight , n - straight);

                result = Math.min(result , all);
            }

        }
        return  (result==Integer.MAX_VALUE)  ? -1 :result;
    }
}