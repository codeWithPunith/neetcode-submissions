class Solution {
    HashMap<Integer,List<Integer>> adjlist = new HashMap<>();
    HashSet<Integer> visited = new HashSet<>();
    HashSet<Integer> cycele = new HashSet<>();
    int flag =0;
    public int[] findRedundantConnection(int[][] edges) {
        for(int i =1 ;i<=edges.length;i++) adjlist.put(i,new ArrayList<>());
        for(int[] edge : edges){
            adjlist.get(edge[0]).add(edge[1]);
            adjlist.get(edge[1]).add(edge[0]);
        }
      for(int i = 1; i <= edges.length; i++){
            if(!visited.contains(i)){
                dfs(i, -1);   
            }
        }

        for(int i = edges.length-1;i>=0;i--){
            if(cycele.contains(edges[i][0])&&cycele.contains(edges[i][1])){
                return new int[] {edges[i][0],edges[i][1]};
            }
        }
        return new int[]{-1};
    }

    void dfs(int node,int parent ){
         visited.add(node);

        for(int nei : adjlist.get(node)){
            if(nei == parent) continue;

            if(visited.contains(nei)){
                getCycleElements(nei, node);
                return;
            }
            dfs(nei, node);
        }
    }

    boolean getCycleElements(int node, int target){
        if(cycele.contains(node)) return false;

        cycele.add(node);
        if(node == target) return true;

        for(int nei : adjlist.get(node)){
            if(getCycleElements(nei, target)) return true;
        }

        cycele.remove(node);
        return false;
    }
}
