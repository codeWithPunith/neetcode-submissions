class Solution {
    int yo =0,ye=0;
    int[][] neighbors ={{1,0},{-1,0},{0,1},{0,-1}};
    public void islandsAndTreasure(int[][] grid) {
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                bfs(r,c,grid);
            }
        }
    }
    public void bfs(int r,int c,int[][] grid){
        if(grid[r][c]==0 || grid[r][c]==-1) return ;
        int ROWS=grid.length ,COLS=grid[0].length;
        int length=0;
         boolean[][] visited = new boolean[ROWS][COLS];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{r, c});
        visited[r][c]=true;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
              int[] qele = q.poll();
              int qr = qele[0];
              int qc = qele[1];
              if(grid[qr][qc]==0){
                grid[r][c]=length;
                return;
              }
              for(int[] nei : neighbors){
                int nr = qr + nei[0];
                int nc = qc + nei[1];

                if (nr < 0 || nc < 0 || nr >= ROWS || nc >= COLS) continue;
                if (grid[nr][nc] == -1) continue;
                if (visited[nr][nc]) continue;

                visited[nr][nc] = true;   
                q.add(new int[]{nr, nc});
              }
            }
            length++;
        }
        return;
    }
}
