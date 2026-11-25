class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<OrangePair> q= new LinkedList<>();

        for(int i = 0; i<grid.length ; i++){
            for(int j = 0 ; j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.add(new OrangePair(i ,j ,0));
                }
            }
        }
        OrangePair rv = null;
        while(!q.isEmpty()){
            //remove
         rv = q.poll();
            //ignore if already visited
            if(grid[rv.row][rv.col]==10){
                continue;
            }
            //add visited
            grid[rv.row][rv.col]=10;
            //seft work
            //add unvisited
            //up
            solve( grid, rv.row-1 , rv.col , rv.time , q);
            //down
            solve(grid ,rv.row+1 , rv.col , rv.time , q);
            //left
            solve(grid, rv.row , rv.col-1 , rv.time , q);
            //right
            solve(grid, rv.row, rv.col+1 , rv.time , q);
        }
            for(int i = 0; i<grid.length ; i++){
                for(int j =0 ;j<grid[0].length ;j++){
                    if(grid[i][j]==1){
                        return -1;
                    }

                }
            }
        
        return (rv==null ? 0  : rv.time);
        
    }
    public void solve( int grid[][],int row , int col , int time , Queue<OrangePair> q){

        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length
          || grid[row][col] == 10 || grid[row][col] != 1 ) {
          return;  
        }
     grid[row][col]=2;
     q.add(new OrangePair(row, col ,time+1));
    }
}   
class OrangePair{
    int row;
    int col;
    int time;
    OrangePair(int row , int col , int time){
        this.row = row;
        this.col = col;
        this.time = time;
    }

}
