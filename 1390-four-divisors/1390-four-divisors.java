class Solution {
    public int sumFourDivisors(int[] nums) {
        int totaladd=0;
        for(int n :nums){
            int count=0;
            int add=0;
           for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    int d1 = i;
                    int d2 = n / i;

                    if (d1 == d2) {   // perfect square
                        count++;
                        add += d1;
                    } else {
                        count += 2;
                        add += d1 + d2;
                    }
                }
            }
            if(count==4){
                totaladd+=add;
           
            }
            
        }
    
        return totaladd;
    }
}