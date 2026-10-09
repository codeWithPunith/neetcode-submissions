class Solution:
    def longestCommonSubsequence(self, text1: str, text2: str) -> int:
        #lets assume s1 is the smallest string 

        cache={}
        def helper(i,j):
            if (i,j) in cache:
                return cache[(i,j)]
            if i>=len(s1) or j>=len(s2):
                return 0
            if s1[i]==s2[j]:
                return 1 + helper(i+1,j+1)
            cache[(i,j)]= max(helper(i,j+1),helper(i+1,j))
            return cache[(i,j)]
        s1,s2="",""
        if len(text1)<len(text2):
            s1=text1
            s2=text2
        else :
            s1=text2
            s2=text1
        if not s1 or not s2:
            return 0
        def helperDp():
            dp = [[0]*(len(s2)+1 )for _ in range(len(s1)+1)]
            #lets fill last row n last column
            
            for r in range(len(s1)-1,-1,-1):
                for c in range(len(s2)-1,-1,-1):
                    if s1[r]==s2[c]:
                        dp[r][c]=1+dp[r+1][c+1]
                        continue

                    dp[r][c]=max(dp[r+1][c],dp[r][c+1])
            return dp[0][0]

            
        return helperDp()

        