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
        HashSet<Integer> nodevisited = new HashSet<>();
        for(int i=1;i<=n;i++) map.put(i,new adjlist());
        for(int[] t : times){
            map.get(t[0]).neighbors.add(new adjlist(t[1],t[2]));
        }
        int[] arr = new int[n+1];
        heap.add(new int[] {0,k});

        while(!heap.isEmpty()){
              int[] ele = heap.poll();
              if(nodevisited.contains(ele[1])) continue;
              nodevisited.add(ele[1]);
              if(!visited.contains(ele[1])){
                arr[ele[1]] = ele[0];
                visited.add(ele[1]);
              }
              for (adjlist nei : map.get(ele[1]).neighbors){
               if(ele[1]!=nei.dest) heap.offer(new int[]{ele[0]+nei.time,nei.dest});
              }
        }
         int max=0;
        for(int i=1;i<=n;i++){
            if(arr[i]==0 && i!=k) return -1;
            max = Math.max(arr[i],max);
        }

        return max;
}
}