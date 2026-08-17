class Solution:
    def arrangeCoins(self, n: int) -> int:
        l,r=0,n
        while l<=r:
            mid = (l+r)//2
            sumUntilMid = (mid*(mid+1))//2
            if sumUntilMid<=n:
                result = mid
                l=mid+1

            else:
                r=mid-1
        return result