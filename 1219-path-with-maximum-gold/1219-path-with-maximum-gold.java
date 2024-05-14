class Solution {
        int ans = 0;
    public int getMaximumGold(int[][] grid) {
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] != 0){
                    dfs(grid,visited, i, j, 0);
                }
            }
        }
        
        return ans;
    }
    
    public void dfs(int[][] grid, boolean visited[][], int i , int j, int csum){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length)
            return;
        
        if(grid[i][j] == 0 || visited[i][j])
            return;
        
        visited[i][j] = true;
        csum = csum + grid[i][j];
        ans = Math.max(ans,csum);
        
        dfs(grid, visited, i+1,j,csum);
        dfs(grid, visited, i-1,j,csum);
        dfs(grid, visited, i,j+1,csum);
        dfs(grid, visited, i,j-1,csum);
        visited[i][j] = false;
    }
}