class Solution {
    List<List<Integer>> supa;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
       supa = new ArrayList<>();
       List<Integer> cur = new ArrayList();
       helper(0,0,nums,target,cur); 
       return supa ;
    }

    void helper(int i , int sum , int[] nums , int target, List<Integer> cur){
        if(sum==target){
            supa.add(new ArrayList(cur));
            return;
        }
        if(target<sum || i == nums.length) return;
        cur.add(nums[i]);
        helper(i,sum+nums[i],nums,target,cur);
        cur.remove(cur.size()-1);
        helper(i+1,sum,nums,target,cur);
    }
}
