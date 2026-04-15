class Solution {
   class adjlist {
    int dest;
    int time;
    List<adjlist> neighbors;

    adjlist(int dest, int time) {
        this.dest = dest;       
        this.time = time;
       // this.neighbors = new ArrayList<>();
    }
    adjlist(){
        this.neighbors = new ArrayList<>();
    }
}
    public int networkDelayTime(int[][] times, int n, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        HashMap<Integer,adjlist> map = new HashMap<>();
        HashSet<Integer> visited = new HashSet<>();
        for(int i=1;i<=n;i++) map.put(i,new adjlist());
        for (int[] t : times) {
            int src = t[0];
            int dest = t[1];
            int time = t[2];
            map.get(src).neighbors.add(new adjlist(dest, time));
        }

        int[] shortest = new int[n+1];

        minHeap.offer(new int[]{0,k});

        while (!minHeap.isEmpty()){
            int[] val = minHeap.poll();
            int time = val[0];
            int node = val[1];
            if (visited.contains(node)) continue;
            if(!visited.contains(node)){
                shortest[node] = time;
                visited.add(node);
            }
            for(adjlist nei : map.get(node).neighbors){
                if(!visited.contains(nei.dest)){
                    minHeap.offer(new int[]{time+nei.time,nei.dest});
                }
            }
        }
        int max = 0;
        for(int i = 1; i <= n; i++){
          if(shortest[i] == 0 && i != k) return -1;
          max = Math.max(max, shortest[i]);
         }
return max;
    }
}
