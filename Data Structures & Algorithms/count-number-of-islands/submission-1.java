class Solution {
      private static final int[][] directions = {{1, 0}, {-1, 0},
                                               {0, 1}, {0, -1}};
    public int numIslands(char[][] grid) {
        int isIslands=0;
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c]=='1'){
                    bfs(r,c,grid);
                    isIslands++;
                }

            }
        }
        return isIslands;
    }

    public void bfs(int r,int c , char[][] grid){
        Queue<int[]> q = new LinkedList<>();
        grid[r][c] = '0';
        q.add(new int[]{r, c});

        while(!q.isEmpty()){
           for(int i=0;i<q.size();i++){
            int[] node = q.poll();
            int row = node[0], col = node[1];
            for (int[] dir : directions) {
                int nr = row + dir[0], nc = col + dir[1];
                if (nr >= 0 && nc >= 0 && nr < grid.length &&
                    nc < grid[0].length && grid[nr][nc] == '1') {
                    q.add(new int[]{nr, nc});
                    grid[nr][nc] = '0';
                }
            }
        }}
    }
}
