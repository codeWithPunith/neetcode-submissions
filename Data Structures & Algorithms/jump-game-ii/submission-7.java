class Solution {
    public int jump(int[] nums) {
        if(nums.length==1) return 0;
        int j=0;
        int maxjump=0;
        int count=0;
        while(j<nums.length){
            maxjump =j+nums[j];
            count++;
            if(maxjump>=nums.length-1) return count;
            int nextIndex=j+1;
            int maxele=nums[j+1];
            for(int i=j+1;i<=maxjump;i++){
                if(i + nums[i] > nextIndex + nums[nextIndex]) {
                  nextIndex = i;
    }
            }
            j=nextIndex;
        }
        return nums.length;
    }
}
