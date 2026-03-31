class Solution {
    public int lengthOfLIS(int[] nums) {
        return dfs(nums, 0, Integer.MIN_VALUE);
    }

    int dfs(int[] nums, int i, int prev) {
        if (i >= nums.length) return 0;


        int skip = dfs(nums, i + 1, prev);

        int take = 0;
        if (nums[i] > prev) {
            take = 1 + dfs(nums, i + 1, nums[i]);
        }

        return Math.max(skip, take);
    }
}