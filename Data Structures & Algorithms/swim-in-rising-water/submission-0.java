class Solution {
    public int swimInWater(int[][] grid) {

        PriorityQueue<int[]> heap =
            new PriorityQueue<>((a, b) -> a[0] - b[0]);
        heap.offer(new int[]{grid[0][0], 0, 0});
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int max =0;
        while(!heap.isEmpty()) {
            int[] ele = heap.poll();
            int i = ele[1];
            int j = ele[2];
            max = Math.max(ele[0],max);
            visited[i][j]=true;
            if(i == grid.length - 1 && j == grid[0].length - 1) {
                return max;
        } else {
                if(i + 1 < grid.length)
                  if(!visited[i+1][j])  heap.offer(new int[]{grid[i+1][j], i+1, j});
                if(i - 1 >= 0)
                   if(!visited[i-1][j])  heap.offer(new int[]{grid[i-1][j], i-1, j});
                if(j + 1 < grid[0].length)
                   if(!visited[i][j+1])  heap.offer(new int[]{grid[i][j+1], i, j+1});
                if(j - 1 >= 0)
                   if(!visited[i][j-1])  heap.offer(new int[]{grid[i][j-1], i, j-1});
            }
        }

        return -1;
    }
}