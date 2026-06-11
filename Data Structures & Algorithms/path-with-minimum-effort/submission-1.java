class Solution {
    public int minimumEffortPath(int[][] heights) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        boolean[][] visited = new boolean[heights.length][heights[0].length];
        ArrayList<Integer> list = new ArrayList<>();
        int[][] dr = {{1,0},{0,1},{-1,0},{0,-1}};
        heap.offer(new int[]{0,0,0});
        //visited[0][0]=true;
        list.add(heights[0][0]);
        while(!heap.isEmpty()){
            int[] curr = heap.poll();
            int edge = curr[0];
            int r= curr[1];
            int c = curr[2];
            if(r==heights.length-1 && c==heights[0].length-1) return edge;
            if(visited[r][c]) continue;
            visited[r][c]=true;
             
            for(int[] d :dr){
               int nr = r+d[0];
               int nc = c+d[1];
                if(nr>=heights.length||nc>=heights[0].length||nr<0||nc<0||visited[nr][nc]) continue;
                int diff = Math.abs(heights[r][c] - heights[nr][nc]);
                int neweffort = Math.max(edge,diff);
                heap.offer(new int[]{neweffort,nr,nc});
            }
            
        }
        
        return -1;
    }
}