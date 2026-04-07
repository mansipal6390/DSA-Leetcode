class Robot {

    int width, height;
    int x = 0, y = 0;
    int dir = 0; // 0=East,1=North,2=West,3=South

    int[][] directions = {{1,0},{0,1},{-1,0},{0,-1}};
    String[] names = {"East","North","West","South"};

    int perimeter;

    public Robot(int width, int height) {
        this.width = width;
        this.height = height;
        perimeter = 2*(width + height) - 4;
    }

    public void step(int num) {
        num = num % perimeter;

        // IMPORTANT FIX
        if(num == 0 && (x == 0 && y == 0)){
            dir = 3; // South
            return;
        }

        while(num-- > 0){
            int nx = x + directions[dir][0];
            int ny = y + directions[dir][1];

            if(nx < 0 || ny < 0 || nx >= width || ny >= height){
                dir = (dir + 1) % 4;
                nx = x + directions[dir][0];
                ny = y + directions[dir][1];
            }

            x = nx;
            y = ny;
        }
    }

    public int[] getPos() {
        return new int[]{x, y};
    }

    public String getDir() {
        return names[dir];
    }
}