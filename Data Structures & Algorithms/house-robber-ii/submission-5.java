class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return nums[0];
        if(nums.length == 1) return nums[0];   
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        int[] lastHouse = new int[nums.length];
        int[] firstHouse = new int[nums.length];
        lastHouse[nums.length-1]= nums[nums.length-1];
        lastHouse[nums.length-2] = Math.max(nums[nums.length-1], nums[nums.length-2]);
        //lastHouse[nums.length-2]= nums[nums.length-2];
       firstHouse[nums.length-1]=0;
        firstHouse[nums.length-2]=nums[nums.length-2];
        for(int i=nums.length-3;i>=0;i--){
             firstHouse[i]=Math.max(nums[i]+firstHouse[i+2],firstHouse[i+1]);
          if(i>=1)  lastHouse[i]=Math.max(nums[i]+lastHouse[i+2],lastHouse[i+1]);

        }
        return Math.max(Math.max(lastHouse[1],lastHouse[2]),Math.max(firstHouse[0],firstHouse[1]));

    }
}
