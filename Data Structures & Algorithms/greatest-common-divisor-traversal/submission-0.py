class Solution:
    def canTraverseAllPairs(self, nums: List[int]) -> bool:
        def gcd(a,b):
            if a==0 or b==0:
                return 0
            res = min(a,b)
            while res!=0:
                if a%res==0 and b%res==0:
                    break
                res-=1
            return res
        def bfs(src,adj,visited):
            q=deque()
            q.append(src)
            visited.add(src)
            res = set()
            
            while q:
                size = len(q)
                for i in range(size):
                    ele = q.popleft()
                    res.add(ele)
                    for nei in adj[ele]:
                        if nei not in visited:
                            visited.add(nei)
                            q.append(nei)
            return res
        adj = {}
        for i in range(len(nums)):
            adj[i]=[]
        for i,ele1 in enumerate(nums):
            for j,ele2 in enumerate(nums):
                if i>=j:
                    continue
                if gcd(ele1,ele2)>1:
                    adj[i].append(j)
                    adj[j].append(i)
        res = set()
        for i in range(len(nums)):
            if adj[i]!=[]:
                res = bfs(i,adj,set())
                break
        return len(res)==len(nums)

        