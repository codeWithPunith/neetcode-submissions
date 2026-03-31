class Solution {

    HashSet<Integer> visited = new HashSet<>();
    Map<Integer, List<Integer>> adjlist = new HashMap<>();
    public int countComponents(int n, int[][] edges) {
      int count = 0;

        for (int i = 0; i < n; i++) {
            adjlist.put(i, new ArrayList<>());
        }
        
        for(int[] pair : edges){
            adjlist.get(pair[0]).add(pair[1]);
            adjlist.get(pair[1]).add(pair[0]);
        }

        for (int i = 0; i < n; i++) {
            if (!visited.contains(i)) {
                dfs(i);
                count++;
            }
        }
        return count;
    }

     void dfs(int node) {
        visited.add(node);

        if (adjlist.get(node).size() == 0) return;

        for (int nei : adjlist.get(node)) {
             if (!visited.contains(nei)) {
                dfs(nei);
            }
        }
    }
}
