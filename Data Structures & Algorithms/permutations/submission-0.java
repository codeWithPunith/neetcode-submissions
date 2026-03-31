class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> supa = helper(0,nums);
        return supa;
    }
    List<List<Integer>> helper(int i , int[] nums){
        if(i== nums.length){
            List<List<Integer>> base = new ArrayList<>();
            base.add(new ArrayList<>());
            return base;
        }
        List<List<Integer>> Prevperms = helper(i+1,nums);
        List<List<Integer>> result  = new ArrayList<>();
        for(List<Integer> p : Prevperms){
            for(int j=0;j<=p.size();j++){
                List<Integer> cur = new ArrayList<>(p);
                cur.add(j,nums[i]);
                result.add(cur);
            }
        }
        return result;
    }
}
