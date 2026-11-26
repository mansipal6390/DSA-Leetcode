class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        
        for(int i= 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i, j);
                    count++;
                }

            }
        }
        return count;
    }
    public void dfs(  char grid[][] ,int i  , int j ){

    if(i<0 ||i>=grid.length || j<0 || j>=grid[0].length ||grid[i][j]=='0'){
        return;
    }
        //ignore if alreadyb visited
        grid[i][j]='0';
        //add visited
        //self work

        //add unvisited
        //up
        dfs(grid , i+1 , j);
        
        //down
        dfs(grid ,i-1 ,j);
        //left
        dfs(grid , i ,j-1);
        //right
        dfs(grid , i , j+1);
        

    }
}