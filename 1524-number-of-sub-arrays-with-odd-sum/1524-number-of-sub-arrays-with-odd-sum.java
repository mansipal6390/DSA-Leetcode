class Solution {
    public int numOfSubarrays(int[] arr) {
        // int count =0;
         int mod = 1000000007;
        // for(int i = 0; i<arr.length ; i++){
        //     int sum = 0;
        //     for(int j = i ; j<arr.length ; j++){    // time coplexity o(n)squre hai islie tle aa rha hai 
        //         sum += arr[j];
            
        //  if(sum%2 !=0){
        //     count = (count+1)%mod;
        //  }
        //     }
        // }
        // return count;

       int even = 1; 
       int odd =0;
       int count  = 0;
       int sum =0;


       for(int nums : arr){
        sum +=nums;
       
       if(sum%2==0){
        count = (count + odd )%mod;
        even++;
       }else{
        count = (count + even)%mod;
        odd++;
       }
       }
       return (int)count;
    }
}