class Solution {
    public int removeElement(int[] nums, int val) {
        int j = nums.length-1;
        int i=0;
        int count=0;
        while(i<=j){
        if(nums[i]==val){
        while(i<j && nums[j]==val){
            j--;
        }
         if (i <= j) {
                    nums[i] = nums[j];
                    j--;
                }
            } else {
                i++; 
            }}
        return j+1;
    }
}