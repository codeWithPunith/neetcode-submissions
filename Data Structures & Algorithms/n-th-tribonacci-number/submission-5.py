class Solution:
    def tribonacci(self, n: int) -> int:
        if n==0:
            return 0
        if n ==1:
            return 1
        if n ==2:
            return 1
        t0,t1,t2=0,1,1
        i=3
        res=t0+t1+t2
        while i<=n:
            res = t0+t1+t2
            t0=t1
            t1=t2
            t2=res
            i+=1
        return res


        