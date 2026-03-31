class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
        int prevSum=nums[0],res=nums[0];
        for(int j=1;j<nums.length;j++){ 
            res=Math.max(nums[j],Math.max(nums[j]+prevSum,res));
            prevSum = Math.max(prevSum+nums[j],0);
        }
        return res;
    }
}