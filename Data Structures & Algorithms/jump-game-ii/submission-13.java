class Solution {
    public int jump(int[] nums) {
        if(nums.length==1) return 0;
        int count =0;
        int start =0 ,end=start+nums[0];
        while(end<nums.length-1){
            count++;
           int max = end;
          
            for(int i=start ;i<=end;i++){
                max = Math.max(i+nums[i],max);
            }
            start=end+1;
            end=max;
        }
        return count+1;
    }
}
