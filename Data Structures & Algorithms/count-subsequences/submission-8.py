class Solution:
    def numDistinct(self, s: str, t: str) -> int:
        cache ={}
        def helper(i,j):
            if (i==len(s) and j == len(t)) or j>=len(t):
                return 1

            elif i>=len(s):
                return 0
            if (i,j) in cache:
                return cache[(i,j)]
            one,two = 0,0
            if s[i]==t[j]:
                one = helper(i+1,j+1)
            
            two = helper(i+1,j)
            cache[(i,j)]=one+two
            return one+two

        def dppp():
            dp = [[0]*(len(s)+1) for _ in range(len(t)+1)]
            for j in range(len(s)+1): dp[len(t)][j] = 1
            for i in range(len(t)-1,-1,-1):
                for j in range(len(s)-1,-1,-1):
                    one,two = 0,0
                    if s[j]==t[i]:
                        one = dp[i+1][j+1]
                    two = dp[i][j+1]
                    dp[i][j]=one+two
            return dp[0][0]


        return dppp()

            

        