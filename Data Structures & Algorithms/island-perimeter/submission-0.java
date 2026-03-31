class Solution {
    boolean[][] visited ;
    public int islandPerimeter(int[][] grid) {
        visited = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                  return  dfs(i,j,grid,visited);
                }
            }
        }
        return 0;
    }
    int dfs(int i,int j,int[][] grid,boolean[][] visited){
        if(i>=grid.length || j>=grid[0].length || i<0 || j<0 || grid[i][j]==0) return 1;
        if(visited[i][j]) return 0;
        visited[i][j]=true;
        int perimeter =0;
        perimeter = dfs(i+1,j,grid,visited)+dfs(i-1,j,grid,visited)+dfs(i,j+1,grid,visited)+dfs(i,j-1,grid,visited);
        return perimeter;
    }
}