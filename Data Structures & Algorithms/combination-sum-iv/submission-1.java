class Solution {
    int count =0;
    HashMap<Integer,Integer> set = new HashMap<>();
    public int combinationSum4(int[] nums, int target) {
       return dfs(0,nums,target);
       
    }
    int dfs(int val,int[] nums,int target){
        if(val>target) return 0;
        if(set.containsKey(val)){  return set.get(val);}
        if(val==target){
        
             return 1;
        }
        int ways=0;
        for(int n : nums){
           ways+= dfs(val+n,nums,target);
        }
        set.put(val,ways);
        return ways;
    }
}