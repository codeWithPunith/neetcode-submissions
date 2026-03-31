class MedianFinder {
PriorityQueue<Integer> small;
 PriorityQueue<Integer> large ;
    public MedianFinder() {
         small = new PriorityQueue<>(Collections.reverseOrder());
         large = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        small.offer(num);
      if(!small.isEmpty() && !large.isEmpty() && small.peek()>large.peek()){
        large.offer(small.poll());
      }
       if(small.size()>large.size()+1) large.offer(small.poll());
       else if(large.size()>small.size()+1)  small.offer(large.poll());

      //  if(small.size()>large.size()+1) large.offer(small.poll());
      //  else if(large.size()>small.size()+1) small.offer(large.poll());
   
    }
    
    public double findMedian() {
        if(small.size()==large.size()){
            return (small.peek()+large.peek())/2.0;
        }else{
            double res = (small.size()>large.size())?small.peek():large.peek();
            return res;
        }
    }
}
