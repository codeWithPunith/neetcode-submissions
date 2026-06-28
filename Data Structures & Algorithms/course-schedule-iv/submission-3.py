class Solution:
    def checkIfPrerequisite(self, numCourses: int, prerequisites: List[List[int]], queries: List[List[int]]) -> List[bool]:
        adj ={}
        for i in range(numCourses):
            adj[i]=[]
        for pre ,post in prerequisites:
            adj[pre].append(post)
        def dfs(pre,post,visited):
            if pre==post:
                return True
            visited.add(pre)
            for nei in adj[pre]:
                if nei not in visited:
                    if dfs(nei,post,visited):
                        return True
            return False
        res=[]
        for pre,post in queries:
            res.append(dfs(pre,post,set()))
        return res

        