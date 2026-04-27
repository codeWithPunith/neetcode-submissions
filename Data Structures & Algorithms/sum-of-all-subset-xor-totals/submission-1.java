class Solution {
    //things That can be made better
    //i guess i can reduce the memory instead of list i can track the sum itself
    List<Integer> finalBoss = new ArrayList<>();
    public int subsetXORSum(int[] nums) {
      return rec(nums,0,0);  
    }

    int rec(int[] nums,int i,int curSum){
        if(i>=nums.length){
         
          return curSum;
        }
        
        int sum1 =rec(nums,i+1,curSum^nums[i]);
        
        int sum2 =rec(nums,i+1,curSum);
        return sum1+sum2;
    }
}