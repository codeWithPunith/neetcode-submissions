class KthLargest {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    int universalK =0;
    public KthLargest(int k, int[] nums) {
        for(int n :nums) maxHeap.offer(n);
        universalK =k;
    }
    
    public int add(int val) {
         PriorityQueue<Integer> sample = new PriorityQueue<>(maxHeap);
         maxHeap.add(val);
         sample.add(val);
         int res=0;
         for(int i=0;i<universalK;i++){
            res = sample.poll();
         }
         return res;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */