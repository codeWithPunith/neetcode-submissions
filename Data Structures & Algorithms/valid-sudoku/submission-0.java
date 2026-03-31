

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] row=new HashSet[9];
         HashSet<Character>[] col=new HashSet[9];
          HashSet<Character>[] square=new HashSet[9];
          for(int i=0;i<9;i++){
            row[i]=new HashSet<>();
            col[i]=new HashSet<>();
            square[i]=new HashSet<>();
          }
          for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                if(board[r][c]=='.') continue;
                if(row[r].contains(board[r][c])||col[c].contains(board[r][c])||square[(r/3)*3+(c/3)].contains(board[r][c])){
                    return false;
                }
                row[r].add(board[r][c]);
                col[c].add(board[r][c]);
                square[(r/3)*3+(c/3)].add(board[r][c]);
            }
          }
          return true;
    }
}
