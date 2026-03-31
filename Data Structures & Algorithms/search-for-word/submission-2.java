class Solution {
    int ROWS,COLS;
    private Set<Pair<Integer, Integer>> path = new HashSet<>();
    public boolean exist(char[][] board, String word) {
        ROWS=board.length;
        COLS=board[0].length;
        for(int r=0; r<ROWS;r++){
            for(int c=0;c<COLS;c++){
        if(dfs(board,r,c,0,word)){
            return true;
        }
            }}
            return false;

    }

    boolean dfs(char[][] board ,int r,int c,int i,String word){
        if(i==word.length()){
            return true;
        }
        if(r<0||c<0||r>=ROWS||c>=COLS||word.charAt(i)!=board[r][c]||path.contains(new Pair<>(r,c))){
            return false;
        }
        path.add(new Pair<>(r, c));
        boolean res =(dfs(board,r+1,c,i+1,word)||dfs(board,r,c+1,i+1,word)||dfs(board,r-1,c,i+1,word)||dfs(board,r,c-1,i+1,word));
        path.remove(new Pair<>(r, c));
        return res;
    }
}
