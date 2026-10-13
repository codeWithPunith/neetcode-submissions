class Solution:
    def change(self, amount: int, coins: List[int]) -> int:
        cache ={}
        def helper(i,curAmount):
            if (i,curAmount) in cache:
                return cache[(i,curAmount)]
            if curAmount > amount:
                return 0
            if curAmount==amount:
                return 1
            if i>=len(coins):
                return 0
            cache[(i,curAmount)]= helper(i,curAmount+coins[i])+helper(i+1,curAmount)
            return cache[(i,curAmount)]
        return helper(0,0)