import java.util.*;

class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {

        Set<String> set = new HashSet<>();
        for (int[] o : obstacles) {
            set.add(o[0] + "," + o[1]);
        }

        int[][] dir = {
            {0,1},   // north
            {1,0},   // east
            {0,-1},  // south
            {-1,0}   // west
        };

        int d = 0; // start north
        int x = 0, y = 0;
        int maxDist = 0;

        for (int cmd : commands) {

            if (cmd == -2) {        // left
                d = (d + 3) % 4;
            }
            else if (cmd == -1) {   // right
                d = (d + 1) % 4;
            }
            else {
                for (int i = 0; i < cmd; i++) {

                    int nx = x + dir[d][0];
                    int ny = y + dir[d][1];

                    if (set.contains(nx + "," + ny))
                        break;

                    x = nx;
                    y = ny;

                    maxDist = Math.max(maxDist, x*x + y*y);
                }
            }
        }

        return maxDist;
    }
}