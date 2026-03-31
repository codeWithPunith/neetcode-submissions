class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> lookup=new HashMap<>();
        int n = nums.length;
         int[] arr= new int[2];
        for(int i =0;i<n;i++){
            lookup.put(nums[i],i);
        } 
        int diff;
        for(int i=0;i<n;i++){
           diff = target-nums[i];
           
           if(lookup.containsKey(diff)&&lookup.get(diff)!=i){
            int j = lookup.get(diff);
           
            if(j>=i){
                arr[0]=i;
                arr[1]=j;
                return arr;
            }
             arr[0]=j;
            arr[1]=i;
            return arr;
           }
           
        }
        return arr;
    }
}
