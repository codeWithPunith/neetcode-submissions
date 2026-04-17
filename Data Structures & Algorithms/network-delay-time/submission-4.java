class Solution {
    class adjlist{
        int dest;
        int time;
        List<adjlist> neighbors = new ArrayList<>();
         adjlist(int dest,int time){
             this.dest = dest;
             this.time = time;
        }
         adjlist() {}
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        HashMap<Integer,adjlist> map = new HashMap<>();
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b)-> a[0]-b[0]);
        HashSet<Integer> visited = new HashSet<>();
       for(int i=1;i<=n;i++) map.put(i,new adjlist());
        for(int[] t : times){
            map.get(t[0]).neighbors.add(new adjlist(t[1],t[2]));
        }
        //finished creating adjlist
        int[] arr = new int[n+1];
        heap.add(new int[] {0,k});
        int t=0;
        while(!heap.isEmpty()){
              int[] ele = heap.poll();
              int node = ele[1];
              int time = ele[0];
              if(visited.contains(node)) continue;
              visited.add(node);
              t = Math.max(t,time);
              for (adjlist nei : map.get(ele[1]).neighbors){
               if(!visited.contains(nei.dest)) heap.offer(new int[]{ele[0]+nei.time,nei.dest});
              }
        }
        

        if (visited.size()==n) return t; else return -1;
}
}