import heapq
from typing import List

class UnionFind:
    def __init__(self, n):
        self.par = {}
        self.rank = {}

        for i in range(n):
            self.par[i] = i
            self.rank[i] = 0

    def find(self, n):
        p = self.par[n]

        while p != self.par[p]:
            self.par[p] = self.par[self.par[p]]
            p = self.par[p]

        return p

    def union(self, n1, n2):
        p1, p2 = self.find(n1), self.find(n2)

        if p1 == p2:
            return False

        if self.rank[p1] > self.rank[p2]:
            self.par[p2] = p1
        elif self.rank[p1] < self.rank[p2]:
            self.par[p1] = p2
        else:
            self.par[p1] = p2
            self.rank[p2] += 1

        return True


class Solution:
    def findCriticalAndPseudoCriticalEdges(self, n: int, edges: List[List[int]]) -> List[List[int]]:
        ogWeight = self.kruskal(n, edges)
        critical = []
        pseudo = []
        #print(mstWeight)
        for i in range(len(edges)):
            newEdge = edges[:i]+edges[i+1:]
            weight = self.kruskal(n,newEdge)
            if weight>ogWeight:
                critical.append(i)
            #now for psuedo critical 
            
            else:
                #newEdge.append(edges[i])
                if self.kruskal(n, newEdge, edges[i]) == ogWeight:
                    pseudo.append(i)
        return [critical, pseudo]

    def kruskal(self, n, edges,forcedEdge=None):
        heap = []

        for src, dest, weight in edges:
            heapq.heappush(heap, [weight, src, dest])

        unionfind = UnionFind(n)

        totalWeight = 0
        edgesUsed = 0
        if forcedEdge:
            src, dest, weight = forcedEdge
            unionfind.union(src, dest)
            totalWeight += weight
            edgesUsed += 1

        while heap and edgesUsed < n - 1:
            weight, src, dest = heapq.heappop(heap)

            if not unionfind.union(src, dest):
                continue

            totalWeight += weight
            edgesUsed += 1

        if edgesUsed != n - 1:
            return float("inf")

        return totalWeight