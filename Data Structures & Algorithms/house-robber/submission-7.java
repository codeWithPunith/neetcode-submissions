class Solution {
    int len ;
    HashMap<Integer,Integer> cache = new HashMap<>();
    public int rob(int[] nums) {
     len = nums.length;
      return rec(nums,0);  
    }
    int rec(int[] nums, int i){
        if(i>=nums.length) return 0;
        if(cache.containsKey(i)) return cache.get(i);
        int left =0,right=0;
        left=(i<nums.length)?nums[i]+rec(nums,i+2):0;
        right = (i<nums.length-1)?nums[i+1]+rec(nums,i+3):0;
        cache.put(i,Math.max(left,right));
        return Math.max(left,right);
    }
}
