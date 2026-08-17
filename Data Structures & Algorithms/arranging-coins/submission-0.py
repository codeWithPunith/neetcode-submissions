class Solution:
    def arrangeCoins(self, n: int) -> int:
        noOfCompletedStairs =0
        stairLevel =1
        while n>0:
            n-=stairLevel
            if n<0:
                return stairLevel-1
            stairLevel+=1
        return stairLevel-1

        