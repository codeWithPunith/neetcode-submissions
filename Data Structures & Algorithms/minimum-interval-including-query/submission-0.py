class Solution:
    def minInterval(self, intervals: List[List[int]], queries: List[int]) -> List[int]:
        res=[]
        for n in queries:
            minsize = float('inf')
            for start,end in intervals:
                if start<=n and n<=end:
                    minsize=min(minsize,(end-start+1))
            res.append(-1 if minsize == float('inf') else minsize)
            
        return res
