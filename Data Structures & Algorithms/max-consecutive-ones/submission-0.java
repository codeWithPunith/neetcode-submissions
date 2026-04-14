class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max =0;
        int temp=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0 ){
              max = Math.max(temp,max);
              temp=0;
            }else if(i==nums.length-1){
                temp++;
                max =Math.max(temp,max);
            }else{
                temp++;
            }
        }
        return max;
    }
}