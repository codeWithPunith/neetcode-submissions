class Solution {
    int res = Integer.MIN_VALUE;
    public int maxProduct(int[] nums) {
        
        for(int i =0 ;i<nums.length;i++){
            int product =nums[i];
              res = Math.max(res, product); 
            for(int j=i+1;j<nums.length;j++){
                product*=nums[j];
                res=Math.max(res,product);
            }
        }
        return res;
    }
}
