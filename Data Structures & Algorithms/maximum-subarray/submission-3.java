class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        int prevSum =nums[0],res=nums[0];
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]+prevSum>=0){ 
                prevSum+=nums[j];
                res = Math.max(res,prevSum);
                }
            else{
                res = Math.max(res,nums[j]);
                prevSum=0;
            } 
        }
        return res;
    }
}
