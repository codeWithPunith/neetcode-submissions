class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int res=0;
        for(int i:nums) res+=i;
        int gigaNigga =0;
        for(int i=0;i<=nums.length;i++) {
           gigaNigga+=i;
        }
        return gigaNigga-res;
    }
}
