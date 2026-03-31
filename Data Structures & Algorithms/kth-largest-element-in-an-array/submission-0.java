class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int n : nums){
            heap.offer(-1*n);
        }
        int res =0;
        for(int i =0;i<k;i++){
            res = -1*heap.poll();
        }
        return res;
    }
}
