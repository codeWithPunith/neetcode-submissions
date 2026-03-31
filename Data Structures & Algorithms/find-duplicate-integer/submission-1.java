class Solution {
    public int findDuplicate(int[] nums) {
        int fast=0,slow=0,slow2=0;
        while(true){
            slow = nums[slow];
            fast = nums[fast];
            fast = nums[fast];
            if(slow==fast) break;
        }
        while(true){
            slow2=nums[slow2];
            slow=nums[slow];
            if(slow==slow2) return slow;
        }
    }
}
