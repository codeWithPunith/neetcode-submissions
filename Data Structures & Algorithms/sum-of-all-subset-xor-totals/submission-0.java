class Solution {
    List<Integer> finalBoss = new ArrayList<>();
    public int subsetXORSum(int[] nums) {
      return rec(nums,0,finalBoss);  
    }

    int rec(int[] nums,int i,List<Integer> list){
        if(i>=nums.length){
          int sum=0;
          if(list.isEmpty()) return 0;
          for(int n : list) sum^=n;
          return sum;
        }
        list.add(nums[i]);
        int sum1 =rec(nums,i+1,list);
        list.remove(list.size()-1);
        int sum2 =rec(nums,i+1,list);
        return sum1+sum2;
    }
}