class Solution:
    def isInterleave(self, s1: str, s2: str, s3: str) -> bool:
        if len(s1) + len(s2) != len(s3):
            return False
        cache ={}
        def helper(i,j):
            #base case 
            if (i,j) in cache:
                return cache[(i,j)]
            if i==len(s1) and j==len(s2):
                return True
            res = False
            if i<len(s1) and (s1[i]==s3[i+j]):
                res = res or helper(i+1,j)
            if j<len(s2) and s2[j]==s3[i+j]:
                res = res or helper(i,j+1)
            
            cache[(i,j)]= res
            return cache[(i,j)]
        
        def helperDp():
            dp = [[False]*(len(s2)+1) for _ in range(len(s1)+1)]
            dp[len(s1)][len(s2)]=True
            for i in range(len(s1),-1,-1):
                for j in range(len(s2),-1,-1):
                    if i<len(s1) and s1[i]==s3[i+j]:
                        dp[i][j]=dp[i][j] or dp[i+1][j]
                    if j<len(s2) and s2[j]==s3[i+j]:
                        dp[i][j] = dp[i][j] or dp[i][j+1]
            return dp[0][0]



        return helperDp()

        