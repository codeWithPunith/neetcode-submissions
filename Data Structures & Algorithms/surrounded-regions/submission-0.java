class Solution {
    public void solve(char[][] board) {
        int ROWS=board.length,COLS=board[0].length;
        boolean[][] visited = new boolean[ROWS][COLS];
        boolean[][] checkable= new boolean[ROWS][COLS];
        for(int r=0;r<ROWS;r++){
            for(int c=0;c<COLS;c++){
                if(board[r][c]=='O'){
                    if (dfs(board,r,c,visited)){
                        board[r][c]='X';
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(checkable));

    }

    boolean dfs(char[][] board,int r,int c,boolean[][] visited){
        if(r<0 || c<0 || r>= board.length || c>=board[0].length ) return false;
        if(visited[r][c]) return true;
        if(board[r][c]=='X') return true;
        visited[r][c]=true;
        boolean up = dfs(board,r+1,c,visited);
        boolean down = dfs(board,r-1,c,visited);
        boolean right = dfs(board,r,c+1,visited);
        boolean left = dfs(board,r,c-1,visited);
        visited[r][c]=false;
        return (up && down && right && left );
    } 
}
