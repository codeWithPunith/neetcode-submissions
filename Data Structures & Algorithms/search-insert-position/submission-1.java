class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1;
        int mid=(l+r)/2;
        while(l<=r){
            mid = (l+r)/2;
            if(target<nums[mid]){
                r=mid-1;
            }else if(target>nums[mid]){
                l=mid+1;
            }else return mid;
        }
        return l;
    }
}