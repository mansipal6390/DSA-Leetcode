
class Solution {
    public int[] replaceElements(int[] arr) {
        // int n = arr.length;

        // for (int i = 0; i < n; i++) {
        //     int max = -1;

        //     for (int j = i + 1; j < n; j++) {
        //         if (arr[j] > max) {                    // broute force code 
        //             max = arr[j];
        //         }
        //     }

        //     arr[i] = max;
        // }

        // return arr;   


        // optimaized 


    

        int max = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }

        return arr;
    
                                
    }
}
