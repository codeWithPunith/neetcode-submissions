class Solution {
    public boolean canPartition(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        set.add(0);
        set.add(nums[nums.length-1]);
        list.add(0);
        list.add(nums[nums.length-1]);
        int totalsum=0;
        for(int n : nums) totalsum+=n;
        if(totalsum % 2 != 0) return false; 
        int target = totalsum/2;
        for(int i=nums.length-2;i>=0;i--){
            int len = list.size();
            for(int j=0;j<len;j++){
                int ele = list.get(j)+nums[i];
                if(!set.contains(ele)){
                    list.add(ele);
                    set.add(ele);
                }
                if(set.contains(target)) return true;
            }
        }
        return false;
    }
}
