class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : stones) maxHeap.add(n);
        while(maxHeap.size()>1){
            int large = maxHeap.poll();
            int small = maxHeap.poll();
            int res = large-small;
            if(res!=0) maxHeap.add(res);
        }
        maxHeap.offer(0);
        return maxHeap.poll();
    }
}