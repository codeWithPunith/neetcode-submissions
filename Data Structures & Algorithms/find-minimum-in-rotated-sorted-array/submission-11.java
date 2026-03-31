class Solution {
    public int findMin(int[] nums) {
        int l =0,r= nums.length-1,mid=0,res=0;

        while(l<=r){
            mid=(l+r)/2;
            if(nums[l]<=nums[r]){
               res = nums[l];
               break;
            }else if(nums[mid]>=nums[l]){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        return res;
    }
}
