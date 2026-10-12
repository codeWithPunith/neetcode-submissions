class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        cache ={}
        def helper(i,bought):
            if (i,bought) in cache:
                return cache[(i,bought)]
            if i>=len(prices):
                return 0
            val1,val2=0,0
            if not bought:
                val1 = max(helper(i+1,not bought)-prices[i],helper(i+1,bought))
            else:
                hold = helper(i+1,bought)
                sell = helper(i+2,not bought)+prices[i]
                val2 = max(hold,sell)
            cache[(i,bought)]= max(val1,val2)
            return cache[(i,bought)]
        return helper(0,False)

        