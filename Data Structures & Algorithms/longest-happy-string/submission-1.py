class Solution:
    def longestDiverseString(self, a: int, b: int, c: int) -> str:
        maxheap =[]
        s=""
        for count,char in [(-a,'a'),(-b,'b'),(-c,'c')]:
            if count!=0:
                heapq.heappush(maxheap,(count,char))
        while maxheap:
            count,char = heapq.heappop(maxheap)
            if len(s)>1 and s[-1]==s[-2]==char:
                if maxheap:
                    count2,char2 = heapq.heappop(maxheap)
                    s+=char2
                    count2+=1
                    if count2:
                        heapq.heappush(maxheap,(count2,char2))
                else:
                    break
            else:
                s+=char
                count+=1
            if count:
                heapq.heappush(maxheap,(count,char))
        return s




        