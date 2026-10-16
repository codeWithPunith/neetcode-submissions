
class Solution:
    def findTargetSumWays(self, nums: List[int], target: int) -> int:
        cache ={}
        
        def helper(i,cursum):
            if (i,cursum) in cache:
                return cache[(i,cursum)]
            if cursum==target and i ==len(nums):
                return 1
            if i>=len(nums):
                return 0
            
            add = helper(i+1,cursum+nums[i])
            sub = helper(i+1,cursum-nums[i])
            cache[(i,cursum)]=add+sub
            return add+sub

        def helperDp():
            total = sum(nums)
            if abs(target)>total:
                return 0

            dp = [[0]*(2*total+1) for _ in range(len(nums)+1)]
            dp[len(nums)][target+total]=1
            for i in range(len(nums)-1,-1,-1):
                for cur in range(-total,total+1):
                    add,sub =0,0
                    if cur+nums[i]<=total:
                        add = dp[i+1][cur+nums[i]+total]
                    if cur-nums[i]>=-total:
                        sub = dp[i+1][cur-nums[i]+total]
                    dp[i][cur+total]=add+sub
            return dp[0][0+total]
        return helperDp()
