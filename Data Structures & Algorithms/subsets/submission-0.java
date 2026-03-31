
class Solution {
    
    public List<List<Integer>> subsets(int[] nums) {
           List<List<Integer>> supa = new ArrayList<>();
      List<Integer> cur = new ArrayList<>();
      helper(0,nums,cur,supa);
      System.out.println(supa); 
      return supa;
    }
    private void helper(int i , int[] nums ,   List<Integer> cur ,List<List<Integer>> supa){
        if (i==nums.length){
            supa.add(new ArrayList<>(cur)   );
            return;
        }
        cur.add(nums[i]);
        helper(i+1,nums,cur,supa);
        cur.remove(cur.size()-1);
        helper(i+1,nums,cur,supa);
    }
}

