import java.util.*;

class Solution {

    public int maxDistance(int side, int[][] points, int k) {
        int n = points.length;
        long[] arr = new long[n];

        // map to 1D
        for (int i = 0; i < n; i++) {
            int x = points[i][0], y = points[i][1];
            if (x == 0) arr[i] = y;
            else if (y == side) arr[i] = side + x;
            else if (x == side) arr[i] = 3L * side - y;
            else arr[i] = 4L * side - x;
        }

        Arrays.sort(arr);

        long[] ext = new long[2 * n];
        for (int i = 0; i < n; i++) {
            ext[i] = arr[i];
            ext[i + n] = arr[i] + 4L * side;
        }

        long low = 0, high = 2L * side, ans = 0;

        while (low <= high) {
            long mid = (low + high) / 2;

            if (canPick(ext, n, k, mid, 4L * side)) {
                ans = mid;
                low = mid + 1;
            } else high = mid - 1;
        }

        return (int) ans;
    }

    private boolean canPick(long[] arr, int n, int k, long d, long perimeter) {

        for (int i = 0; i < n; i++) {
            int count = 1;
            long first = arr[i];
            long last = arr[i];
            int idx = i;

            // pick next k-1 points
            for (int c = 1; c < k; c++) {

                // 🔥 binary search for next valid point
                int next = lowerBound(arr, idx + 1, i + n, last + d);

                if (next == i + n) break;

                last = arr[next];
                idx = next;
                count++;
            }

            if (count == k && (last - first) <= perimeter - d) {
                return true;
            }
        }

        return false;
    }

    private int lowerBound(long[] arr, int l, int r, long target) {
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] >= target) r = mid;
            else l = mid + 1;
        }
        return l;
    }
}