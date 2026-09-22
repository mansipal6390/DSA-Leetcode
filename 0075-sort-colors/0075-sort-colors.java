class Solution {
    public void sortColors(int[] nums) {
        for(int i = 0; i<nums.length-1 ; i++){
            int min = i; 
            for(int j = i+1 ; j<nums.length ; j++){
                if(nums[j]<nums[min]){
                    min = j;
                }
                
            }
            int minpos = nums[min];
            nums[min] = nums[i];
            nums[i] = minpos;
        }
    

      //// by using ductch national falag algorithim



    //   int low =0;
    //   int mid  = 0;
    //   int high = n-1;
    // while(low<mid){
    //     if(nums[mid] ==0){
    //         nums[mid] = nums[low];
    //         low++;
    //         mid++;
    //     }else if (nums[mid]==2){
    //         nums[mid] = nums[high];
    //         high--;
    //     }
   // }

    
       
        
    }
}