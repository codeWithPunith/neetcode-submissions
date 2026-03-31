class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int target = cost.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : cost) list.add(n);
        list.add(0);
        
        for(int i = target-3;i>=0;i--){
            int ele = Math.min((list.get(i)+list.get(i+1)),(list.get(i)+list.get(i+2)));
            list.set(i,ele);
        }
        return Math.min(list.get(0),list.get(1));
    }
}
