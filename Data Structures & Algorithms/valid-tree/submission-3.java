class Solution {
    HashMap<Integer,List<Integer>> adjlist = new HashMap<>();
    public boolean validTree(int n, int[][] edges) {
         if (edges.length != n - 1) return false;
       for(int i=0;i<n;i++) adjlist.put(i,new ArrayList<>());
       for(int[] edge : edges){
        adjlist.get(edge[0]).add(edge[1]);
        adjlist.get(edge[1]).add(edge[0]);
      } 
      Queue<int[]> q = new LinkedList<>();
      HashSet<Integer> visited = new HashSet<>();
      q.add(new int[]{0,-1});
       visited.add(0);
      while(!q.isEmpty()){
            int[] pair = q.poll();
            int node = pair[0],parent=pair[1];
            for(int nei : adjlist.get(node)){
                if(nei==parent) continue;
                if (visited.contains(nei)) return false;  

                visited.add(nei);
                q.add(new int[]{nei,node});
            }
      }
      return visited.size()==n;
    }
}
