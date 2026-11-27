
class Solution {
    public int splitArray(int[] arr, int k){

        if (arr.length < k) {
            return -1;
        }

        long low = Arrays.stream(arr).max().getAsInt();
        long high = 0;

        for (int x : arr) {
            high += x;
        }

        long ans = -1;

        while (low <= high) {

            long mid = low + (high - low) / 2;

            if (IsItPossible(arr, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int) ans;
    }

    public boolean IsItPossible(int[] arr, int m, long mid) {

        int student = 1;
        long readpage = 0;

        for (int i = 0; i < arr.length; i++) {

            if (readpage + arr[i] <= mid) {
                readpage += arr[i];
            } else {
                student++;
                readpage = arr[i];
            }

            if (student > m) {
                return false;
            }
        }

        return true;
    }
}
