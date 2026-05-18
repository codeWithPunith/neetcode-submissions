class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i=0;
        int j=i+1;
        list.add(nums[0]);
        for(j=j;j<nums.length;j++){
           if(nums[i]==nums[j]){
            i++;
            continue;
           }
            list.add(nums[j]);
           i++;
        }
        System.out.println(list.size());
        for(int k=0;k<list.size();k++) nums[k]=list.get(k);
           return list.size();
    }
}