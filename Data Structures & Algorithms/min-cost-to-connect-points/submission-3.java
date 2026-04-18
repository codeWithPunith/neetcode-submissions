class Solution {
    public int minCostConnectPoints(int[][] points) {
        int N = points.length;
        Map<Integer, List<int[]>> adj = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            for (int j = i + 1; j < N; j++) {
                int x2 = points[j][0];
                int y2 = points[j][1];
                int dist = Math.abs(x1 - x2) + Math.abs(y1 - y2);
                adj.computeIfAbsent(i, k -> new ArrayList<>()).add(new int[]{dist, j});
                adj.computeIfAbsent(j, k -> new ArrayList<>()).add(new int[]{dist, i});
            }
        }
         int res = 0;
        Set<Integer> visited = new HashSet<>();
        PriorityQueue<int[]> minH = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        minH.offer(new int[]{0, 0});
        while(!minH.isEmpty()){
            int[] ele = minH.poll();
            int src = ele[1];
            int cost = ele[0];
            if(visited.contains(src)) continue;
            visited.add(src);
            res+=cost;
            for (int[] nei : adj.getOrDefault(src, Collections.emptyList())) {
                if(!visited.contains(nei[1])){
                    minH.offer(new int[]{nei[0],nei[1]});
                }
            }
        }
        return res;

    }
}
