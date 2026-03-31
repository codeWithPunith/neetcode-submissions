class Solution {
    int res = Integer.MIN_VALUE;
    public int maxProduct(int[] nums) {
       for (int i = 0; i < nums.length; i++) {
            rec(nums, nums[i], i, nums.length);
        }
        return res;
    }

    void rec(int[] nums,int product,int i,int len){
        res = Math.max(res,product);
        if(i+1>=len){
            return;
        }
        rec(nums,product*nums[i+1],i+1,len);

    }
}
