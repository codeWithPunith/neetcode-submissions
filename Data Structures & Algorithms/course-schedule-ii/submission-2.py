class Solution:
    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> List[int]:
        adj={}
        visited = set()
        res=[]
        for i in range(numCourses):
            adj[i]=[]
        for post,pre in prerequisites:
            adj[pre].append(post)

        def ts(src,cycle):
            if src in cycle :
                return False
            if src in visited :
                return True
            cycle.add(src)
            visited.add(src)
            for nei in adj[src]:
                if not ts(nei,cycle):
                    return False
            cycle.remove(src)
            res.append(src)
            return True
        for i in range(numCourses):
            if not ts(i,set()):
                return []
        res.reverse()
        return res
        
        