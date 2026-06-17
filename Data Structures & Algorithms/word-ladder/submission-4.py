class Solution:
    def ladderLength(self, beginWord: str, endWord: str, wordList: List[str]) -> int:
        def bfs(w,beginWord,endWord):
            q=[w]
           # q.append(w)
            count =2
            visited={w}
            gotit=False
            while q:
                size = len(q)
                for _ in range(size):
                    ele = q.pop(0)
                    if ele == endWord:
                        return count
                    for nei in adj[ele]:
                        if nei not in visited:
                            visited.add(nei)
                            q.append(nei)
                count+=1
            return 0
        
        def isOneWordiffer(w,subword):
            count =0
            for i in range(len(w)):
                if w[i]!=subword[i]:
                    count+=1
            return count==1
        
        def buildGraph(wordlist,adj):
            for w in wordList:
                for subword in wordList:
                    if w==subword:
                        continue
                    if isOneWordiffer(w,subword):
                        adj[w].append(subword)
        if endWord not in wordList:
            return 0
        adj = defaultdict(list)
        buildGraph(wordList,adj)
        res =[]
        realreslol = float('inf')   
        for w in wordList:
            if isOneWordiffer(w,beginWord):
                ans = bfs(w,beginWord,endWord)
                if ans!=0:
                    realreslol = min(ans,realreslol)
        if realreslol ==float('inf'):
            return 0
        return realreslol
