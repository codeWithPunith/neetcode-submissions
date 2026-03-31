class Solution {
    public boolean canJump(int[] nums) {
        return dfs(nums,nums[0],0);
    }
    boolean dfs(int[] nums,int val, int i){
        if(i+nums[i]>=nums.length-1) return true;
        if (val==0) return false;
        boolean boo = false;
        for(int j=1;j<=val;j++){
          boo = boo || dfs(nums,nums[i+j],i+j);
        }
        return boo;
    }
}
