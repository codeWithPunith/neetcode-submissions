class Solution {
    Map<Integer,List<Integer>> adjlist;
    HashSet<Integer> visited = new HashSet<>();
    HashSet<Integer> cycle = new HashSet<>();
    ArrayList<Integer> res = new ArrayList<>();
    int[] ans;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        adjlist = new HashMap<>();
         ans= new int[numCourses];
        for(int i =0;i<numCourses;i++){
            adjlist.put(i,new ArrayList<>());
        }
        for(int[] edge : prerequisites ){
            adjlist.get(edge[0]).add(edge[1]);
        }
        for(int i=0;i<numCourses;i++){
           if (!dfs(i)) return new int[0] ;
        }
        
        int i=0;
        for(int n : res) ans[i++]=n;
        return ans;
    }

    boolean dfs(int src){
       if(visited.contains(src)) return true;
       if(cycle.contains(src)) return false;
    
       
       cycle.add(src);
       for(int nei : adjlist.get(src)){
        if(!dfs(nei)) return false;
       }
       cycle.remove(src);
       visited.add(src);
       adjlist.put(src,new ArrayList<>());
       res.add(src);
       return true;
    }
}
