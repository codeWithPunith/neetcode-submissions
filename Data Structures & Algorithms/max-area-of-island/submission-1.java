class Solution {
int[][] neighbors = {{0,1},{0,-1},{1,0},{-1,0}};

    public int maxAreaOfIsland(int[][] grid) {
        int max =0;
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c]==1){
                   max= Math.max(max,bfs(grid,r,c)); 
                }
            }
        }
        return max;
    }

    int bfs(int[][] grid,int r ,int c){
        int ROWS = grid.length,COLS = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int count=0;
        q.add(new int[]{r,c});
        grid[r][c]=0;
        count++;
        while(q.size()>0){
       // if(Math.min(r,c)<0 || r>=ROWS || c>=COLS ||grid[r][c]==0) return count;
        int[] qele = q.poll();
        int qr = qele[0];
        int qc = qele[1];
        for(int[] d : neighbors ){
            int dr = d[0];
            int dc=d[1];
            if(Math.min(qr+dr,qc+dc)<0 || qr+dr>=ROWS || qc+dc>=COLS || grid[qr+dr][qc+dc]==0) continue;
            grid[qr+dr][qc+dc]=0;
            q.add(new int[]{qr+dr,qc+dc});
            count++;
        }
        }
        return count;
    }
}
