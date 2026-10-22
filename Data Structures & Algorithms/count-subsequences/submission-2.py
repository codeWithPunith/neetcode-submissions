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
        return helper(0,0)

            

        