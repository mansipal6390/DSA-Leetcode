class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totalapple=0;
       for(int a:apple){
        totalapple+=a;
       }
       Arrays.sort(capacity);

       int totalcapacity = 0;
       int boxes=0;
       for(int i = capacity.length-1; i>=0; i--){
         totalcapacity+=capacity[i];
         boxes++;

         if(totalapple<=totalcapacity){
            return boxes;
         }

        
       }
         return boxes;
        
    }
}