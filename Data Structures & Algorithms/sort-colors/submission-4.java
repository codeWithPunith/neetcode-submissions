class Solution {
    public void sortColors(int[] nums) {
        int left =0,right=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0 && i>=left){
                int temp = nums[left];
                nums[left]=nums[i];
                nums[i]=temp;
                left++;
                //i--;
            }else if(nums[i]==2 && i<=right){
                int temp = nums[right];
                nums[right]=nums[i];
                nums[i]=temp;
                right--;
                i--;
            }
        }
    }
}