class Solution {
    public int countCommas(int n) {
         long commas = 0;

         if (n >= 1000) {
             commas += Math.min(n, 999999) - 999;
         }

        if (n >= 1000000) {
            commas += 2L * (Math.min(n, 999999999) - 999999);
         }

         if (n >= 1000000000) {
            commas += 3L * (n - 999999999);
         }

         return (int) commas;   
        
    }
}