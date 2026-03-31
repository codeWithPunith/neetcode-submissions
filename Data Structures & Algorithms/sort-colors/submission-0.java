class Solution {
    public void sortColors(int[] nums) {
        int[] counts = new int[3];
        for(int n : nums){
            if(n==0) counts[0]++;
            if(n==1) counts[1]++;
            if(n==2) counts[2]++;
        }
        for(int i=0;i<nums.length;i++){
            if(counts[0]>0){
                nums[i]=0;
                counts[0]--;
            }else if(counts[1]>0){
                nums[i]=1;
                counts[1]--;
            }else if(counts[2]>0){
                nums[i]=2;
                counts[2]--;
            }
        }
    }
}