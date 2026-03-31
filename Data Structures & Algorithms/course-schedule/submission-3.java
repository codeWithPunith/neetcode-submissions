class Solution {
    Map<Integer,List<Integer>>  adjlist;
     private Set<Integer> visiting = new HashSet<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
         adjlist= new HashMap<>();
        for(int i=0;i<numCourses;i++) adjlist.put(i,new ArrayList<>());
        for(int[] prereq : prerequisites){
            adjlist.get(prereq[0]).add(prereq[1]);
        }
         for (int c = 0; c < numCourses; c++) {
            if (!dfs(c)) {
                return false;
            }
        }
        return true;
    }

    boolean dfs(int crs){
        if(visiting.contains(crs)) return false;
        if(adjlist.get(crs).isEmpty()) return true;
        visiting.add(crs);
        for(int nei : adjlist.get(crs)){
            if(!dfs(nei)) return false;
        }
        visiting.remove(crs);
        adjlist.put(crs,new ArrayList<>());
        return true;
    }
}
