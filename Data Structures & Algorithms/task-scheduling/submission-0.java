class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for (char task : tasks) {
            count[task - 'A']++;
        }
         PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
         for(int ctn :count){
           if(ctn>0) maxHeap.add(ctn);
         }
   
         Queue<int[]> q = new LinkedList<>();
         int tim =0;
         while(!maxHeap.isEmpty() || !q.isEmpty()){
            tim++;
            if(maxHeap.isEmpty()){
                tim=q.peek()[1];
            }else{
                int cnt = maxHeap.poll()-1;
                if(cnt>0){
                    q.add(new int[]{cnt,tim+n});
                }
            }
            if (!q.isEmpty() && q.peek()[1] == tim) {
                maxHeap.add(q.poll()[0]);
            }

         }
         return tim ;
    }
}
