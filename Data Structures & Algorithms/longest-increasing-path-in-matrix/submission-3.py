class Solution:
    def longestIncreasingPath(self, matrix: List[List[int]]) -> int:
        grid  = matrix
        def inbounds(i,j):
            if i<0 or j<0 or i>=len(matrix) or j >=len(matrix[0]):
                return False
            return True 
        def helper(i,j,cache):
            if (i,j) in cache:
                return cache[(i,j)]
            
            if not inbounds(i,j):
                return 0
            up,down,right,left =0,0,0,0
            if i+1<len(grid) and grid[i+1][j] > grid[i][j]:
                up = helper(i+1,j,cache)+1
            if i-1>=0 and grid[i-1][j]>grid[i][j]:
                down = helper(i-1,j,cache)+1
            if j+1<len(grid[0]) and grid[i][j+1]>grid[i][j]:
                right=helper(i,j+1,cache)+1
            if j-1>=0 and grid[i][j-1]>grid[i][j]:
                left = helper(i,j-1,cache)+1
            cache[(i,j)]= max(up,down,left,right)
            return cache[(i,j)]
        res = 0
        cache={}
        for i  in range(len(matrix)):
            for j in range(len(matrix[0])):
                res = max(res ,helper(i,j,cache))
        return res+1
        