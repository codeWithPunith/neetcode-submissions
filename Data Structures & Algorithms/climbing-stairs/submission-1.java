class Solution {
    //Implementing memoization 
    HashMap<Integer,Integer> cache = new HashMap<>();

    public int climbStairs(int n) {
        return dfs(n);
    }

    int dfs(int n){
        if(cache.containsKey(n)) return cache.get(n);
        if(n==1) return 1;
        if(n==2) return 2;
        int left = dfs(n-1);
        int right = dfs(n-2);
        cache.put(n,left+right);
        return left+right;
    }
}
