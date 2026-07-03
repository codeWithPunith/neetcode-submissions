"""
Definition of Interval:
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""

class Solution:
    def minMeetingRooms(self, intervals: List[Interval]) -> int:
        if(len(intervals)==0):
            return 0
        minheap=[]
        intervals.sort(key= lambda x:x.start)
        heapq.heappush(minheap,intervals[0].end)
        for i in range(1,len(intervals)):
            start,end=intervals[i].start,intervals[i].end
            if(start>=minheap[0]):
                heapq.heappop(minheap)
            heapq.heappush(minheap,end)
            
                
        return len(minheap)
        