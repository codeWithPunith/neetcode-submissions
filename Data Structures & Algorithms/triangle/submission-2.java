class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.get(triangle.size()-1).size()+1];
        for(int j=triangle.size()-1;j>=0;j--){
            for(int i=0;i<triangle.get(j).size();i++){
                dp[i]=triangle.get(j).get(i)+Math.min(dp[i],dp[i+1]);
            }
        }
        return dp[0];
    }
}