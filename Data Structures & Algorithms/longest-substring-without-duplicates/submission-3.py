class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s)==0:
            return 0
        if len(s)==1:
            return 1
        l,r=0,1
        res=0
        sett=set(s[0])
        while r<len(s) and l<len(s):
            while s[r] in sett:
                sett.remove(s[l])
                l+=1
            sett.add(s[r])
            r+=1
            res = max(res,r-l+1)
        return res-1
            
        