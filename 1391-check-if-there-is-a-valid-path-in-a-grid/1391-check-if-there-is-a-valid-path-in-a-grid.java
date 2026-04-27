import java.util.*;

class Solution {
    public boolean hasValidPath(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        // Maps street type to the directions it connects to: {row_offset, col_offset}
        int[][][] directions = {
            {}, // Placeholder for index 0
            {{0, -1}, {0, 1}},  // 1: Left, Right
            {{-1, 0}, {1, 0}},  // 2: Up, Down
            {{0, -1}, {1, 0}},  // 3: Left, Down
            {{0, 1}, {1, 0}},   // 4: Right, Down
            {{0, -1}, {-1, 0}}, // 5: Left, Up
            {{0, 1}, {-1, 0}}   // 6: Right, Up
        };

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];

        queue.add(new int[]{0, 0});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];

            if (r == m - 1 && c == n - 1) return true;

            int streetType = grid[r][c];
            for (int[] dir : directions[streetType]) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                if (nr >= 0 && nr < m && nc >= 0 && nc < n && !visited[nr][nc]) {
                    // Check if the neighbor can connect back to the current cell
                    if (canConnectBack(grid[nr][nc], -dir[0], -dir[1], directions)) {
                        visited[nr][nc] = true;
                        queue.add(new int[]{nr, nc});
                    }
                }
            }
        }

        return false;
    }

    private boolean canConnectBack(int nextStreetType, int targetDr, int targetDc, int[][][] directions) {
        for (int[] backDir : directions[nextStreetType]) {
            if (backDir[0] == targetDr && backDir[1] == targetDc) {
                return true;
            }
        }
        return false;
    }
}