class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i=0;
        for(int j=0;j<nums.length;j++){
            int diff = target-nums[j];
            if(map.containsKey(diff)) return new int[]{map.get(diff),j};
            map.put(nums[j],j);     
        }
        return new int[]{0};
    }
}
