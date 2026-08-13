class Solution {
    public int numIslands(char[][] grid) {
        int numIslands = 0;

        int length = grid.length;
        int width = grid[0].length; 

        for (int r = 0; r < length; r++) {
            for (int c = 0; c < width; c++) {
                if (grid[r][c] == '1') {
                    dfs(grid, r, c); 
                    numIslands++; 

                }
            }
        }
        return numIslands; 
        
    }

    public void dfs(char[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length ||
            c >= grid[0].length || grid[r][c] == '0') {
            return;
        }
        grid[r][c] = '0';

        dfs(grid, r + 1, c); 
        dfs(grid, r - 1, c); 
        dfs(grid, r, c + 1); 
        dfs(grid, r, c -1); 

    }
}
