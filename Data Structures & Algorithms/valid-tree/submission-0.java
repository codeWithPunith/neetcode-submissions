class Solution {
    HashMap<Integer,List<Integer>> adjlist = new HashMap<>();
    public boolean validTree(int n, int[][] edges) {
         if (edges.length != n - 1) return false;
       for(int i=0;i<n;i++) adjlist.put(i,new ArrayList<>());
       for(int[] edge : edges){
        adjlist.get(edge[0]).add(edge[1]);
        adjlist.get(edge[1]).add(edge[0]);
      } 
      Queue<Integer> q = new LinkedList<>();
      HashSet<Integer> visited = new HashSet<>();
      q.add(0);
       visited.add(0);
      while(!q.isEmpty()){
            int node = q.poll();
            for(int nei : adjlist.get(node)){
                if (visited.contains(nei)) continue;  

                visited.add(nei);
                q.add(nei);
            }
      }
      return visited.size()==n;
    }
}
