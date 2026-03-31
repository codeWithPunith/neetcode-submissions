class Solution {
    HashMap<Integer,Boolean> memo = new HashMap<>();
    public boolean canJump(int[] nums) {
        return dfs(nums,nums[0],0);
    }
    boolean dfs(int[] nums,int val, int i){
        if(memo.containsKey(i)) return memo.get(i);
        if(i+nums[i]>=nums.length-1){ 
            memo.put(i+nums[i],true);
            return true;}
        if (val==0) return false;
        boolean boo = false;
        for(int j=1;j<=val;j++){
          boo = boo || dfs(nums,nums[i+j],i+j);
        }
        return boo;
    }
}



