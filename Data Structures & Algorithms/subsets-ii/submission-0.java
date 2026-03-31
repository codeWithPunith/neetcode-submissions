class Solution {
    List<List<Integer>> supa;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        supa = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(nums);
        helper(0,nums,cur);
        return supa ;
    }
    void helper(int i , int[] nums,List<Integer> cur ){
        if(i==nums.length){
            supa.add(new ArrayList(cur));
            return;
        }
        cur.add(nums[i]);
        helper(i+1,nums,cur);
        cur.remove(cur.size()-1);
        while(i<nums.length-1 && nums[i]==nums[i+1]) i++;
        helper(i+1,nums,cur);
    }
}
