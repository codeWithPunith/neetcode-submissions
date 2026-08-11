class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        dp = [float('inf')]*(amount+1)
        dp[0]=0
        for currentMoney in range(1,amount+1):
            for c in coins:
                if currentMoney - c>=0:
                    dp[currentMoney]= min(dp[currentMoney],1+dp[currentMoney-c])
        if dp[amount]==float('inf'):
            return -1
        return dp[amount]
        