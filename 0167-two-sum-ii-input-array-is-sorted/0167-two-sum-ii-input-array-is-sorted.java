class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // for(int  i = 0 ; i<numbers.length-1 ; i++){
        //     int sum = 0;
        //     for(int j = i+1 ; i<numbers.length-1 ; j++){
        //         sum = numbers[i] + numbers[j];
        //         if(sum==target){
        //             return new int[]{i+1 ,j+1};
        //         }
        //     }
        // }
        // return new int[]{} ;

        int left = 0;
        int right = numbers.length-1;

        while(left <right){
            if(numbers[left]+numbers[right]==target){
                 return new int[]{left + 1, right + 1};
            }
            if(numbers[left]+numbers[right]<target){
                left++;
            }
            if(numbers[left]+numbers[right]>target){
                right--;
            }
        }
     return new int []{};

    }
}