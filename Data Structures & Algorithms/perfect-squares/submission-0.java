class Solution {
    Integer[] memo;
    public int numSquares(int n) {
        memo = new Integer[n + 1];
        return dfs(n);
    }

    int dfs(int n){
        if(n == 0) return 0;
        if(memo[n] != null) return memo[n];
        int min = Integer.MAX_VALUE;
        for(int j = 1; j * j <= n; j++){
           min = Math.min(min, 1 + dfs(n - j * j));
        }
        return memo[n] = min;
    }
}