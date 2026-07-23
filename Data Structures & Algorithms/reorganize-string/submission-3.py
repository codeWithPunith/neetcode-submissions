class Solution:
    def reorganizeString(self, s: str) -> str:
        count = Counter(s)
        maxheap =[[-val,c] for c,val in count.items()]
        heapq.heapify(maxheap)
        prev = None 
        res=""
        while maxheap or prev:
            if not maxheap and prev:
                return ""
            val,c = heapq.heappop(maxheap)
            res+=c
            val+=1
            if prev:
                heapq.heappush(maxheap,prev)
                prev = None
            if val!= 0 :
                prev = [val,c]
        return res
            