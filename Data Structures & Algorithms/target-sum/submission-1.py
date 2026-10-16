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
        return helper(0,0)