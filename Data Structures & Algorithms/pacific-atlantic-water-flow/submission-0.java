class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
       int ROWS=heights.length, COLS=heights[0].length;
       List<List<Integer>> res = new ArrayList<>();
       boolean[][] pacific = new boolean[ROWS][COLS];
        boolean[][] atlantic = new boolean[ROWS][COLS];
       for(int c =0;c<COLS;c++ ){
        dfs(heights,0,c,pacific,heights[0][c]);
        dfs(heights,ROWS-1,c,atlantic,heights[ROWS-1][c]);
       }
       for(int r=0;r<ROWS;r++){
        dfs(heights,r,0,pacific,heights[r][0]);
        dfs(heights,r,COLS-1,atlantic,heights[r][COLS-1]);
       }
       for(int r=0;r<ROWS;r++){
        for(int c=0;c<COLS;c++){
            if(pacific[r][c] && atlantic[r][c]){
                res.add(Arrays.asList(r,c));
            }
        }
       }
       return res;
    }

    void dfs(int[][] heights,int r,int c,boolean[][] ocean,int prev){
        int ROWS=heights.length, COLS=heights[0].length;
        if(r<0 || c<0 || r>=ROWS ||c>=COLS || ocean[r][c]) return ;
        if (heights[r][c] < prev) return;
        ocean[r][c]=true;
        dfs(heights,r+1,c,ocean,heights[r][c]);
        dfs(heights,r-1,c,ocean,heights[r][c]);
        dfs(heights,r,c+1,ocean,heights[r][c]);
        dfs(heights,r,c-1,ocean,heights[r][c]);
        
    }

}
