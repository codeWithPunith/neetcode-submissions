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
        return helper(0,0)

        