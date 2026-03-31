class Solution {
    public int rob(int[] nums) {
        if(nums.length<=1) return nums[0];
    int[] res = new int[nums.length];
    res[nums.length-1] = nums[nums.length-1];
    res[nums.length-2] = nums[nums.length-2];
    for(int i=nums.length-3;i>=0;i--){
            res[i] = Math.max(nums[i]+res[i+2],res[i+1]);
    }
    return (res[0]>res[1])?res[0]:res[1];
    }
}
