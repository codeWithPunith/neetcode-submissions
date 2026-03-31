class Solution {
    List<List<Integer>> supa;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        supa = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(candidates);
        helper(0,0,candidates,cur,target);
        return supa ;
    }
    void helper(int i , int sum ,int[] candidates, List<Integer> cur , int target ){
        if(sum == target){
            supa.add(new ArrayList<>(cur));
            return;
        }
        if(target< sum || i >= candidates.length){
            return ;
        }
        cur.add(candidates[i]);
        helper(i+1,sum+candidates[i],candidates,cur,target);
        cur.remove(cur.size()-1);
        while(i<candidates.length-1 && candidates[i]==candidates[i+1]) i++;
        helper(i+1,sum,candidates,cur,target);
    }
}
