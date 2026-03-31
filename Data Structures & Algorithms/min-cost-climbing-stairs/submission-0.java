class Solution {
    int n;
    int[] arr ;
    HashMap<Integer,Integer> cache = new HashMap<>();
    public int minCostClimbingStairs(int[] cost) {
        n = cost.length;
       arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=cost[i];
        return Math.min(dfs(0,cost),dfs(1,cost));
    }

    int dfs(int i,int[] cost) {
    if (i >= n) return 0;
    if(cache.containsKey(i)) return cache.get(i);
    int one = dfs(i + 1,cost);
    int two = dfs(i + 2,cost);
    cache.put(i,cost[i] + Math.min(one, two));
    return cost[i] + Math.min(one, two);
}

}
