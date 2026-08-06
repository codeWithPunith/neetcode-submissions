class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        stk=[]
        nums = temperatures
        res=[0]*len(nums)
        for i in range(len(nums)):   
            while stk and stk[-1][0]<nums[i]:
                ele , index = stk.pop()
                res[index]=i-index
            stk.append((nums[i],i))
        
        return res
        