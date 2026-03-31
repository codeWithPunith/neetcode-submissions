class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh=0;
        int[][] neighbors ={{1,0},{-1,0},{0,1},{0,-1}};
        int ROWS=grid.length, COLS=grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int r=0;r<ROWS;r++){
            for(int c=0;c<COLS;c++){
                if(grid[r][c]==2) q.add(new int[]{r,c});
                else if(grid[r][c]==1) fresh++;
            }
        }
        int time=0;
        while(!q.isEmpty() && fresh>0){
          int size = q.size();
          for(int i =0;i<size;i++){
            int[] qele = q.poll();
            for(int[] nei : neighbors){
                int nr = nei[0]+qele[0];
                int nc = nei[1]+qele[1];
                if(nr<0 || nc<0|| nr>=ROWS ||nc>=COLS || grid[nr][nc]!=1) continue;
                q.add(new int[]{nr,nc});
                grid[nr][nc]=2;
                fresh-=1;
            }
          }
          time ++;
        }

        if(fresh==0) return time ;
        else return -1;
    }
}
