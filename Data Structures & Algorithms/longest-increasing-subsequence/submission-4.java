class Solution {
    public int lengthOfLIS(int[] nums) {
            int n = nums.length;
        int[] dp = new int[n];

        for(int i = n-1; i >= 0; i--){
            dp[i] = 1;
            for(int j = i+1; j < n; j++){
                if(nums[j] > nums[i]){
                    dp[i] = Math.max(dp[i], 1 + dp[j]);
                }
            }
        }

        int max = 0;
        for(int x : dp) max = Math.max(max,x);

        return max;
    }
}
