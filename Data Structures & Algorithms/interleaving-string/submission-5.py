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
        return helper(0,0)

        