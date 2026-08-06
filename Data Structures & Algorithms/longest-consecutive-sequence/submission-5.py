class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        set_of_nums = set(nums)
        res=0
        for n in set_of_nums:
            curRes=1
            if n-1 in set_of_nums:
                continue
            ele = n+1
            while ele in set_of_nums:
                curRes+=1
                ele+=1
            res=max(res,curRes)
        return res
        