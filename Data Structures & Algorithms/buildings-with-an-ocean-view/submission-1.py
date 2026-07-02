class Solution:
    def findBuildings(self, heights: List[int]) -> List[int]:
        Max =0
        ans=[]
        for i,buildingHeight in reversed(list(enumerate(heights))):
            if buildingHeight >Max:
                ans.append(i)
            Max = max(Max,buildingHeight)
        return ans[::-1]
        
        