class Solution {
    class MyNode {
    float distance; 
    int id;         

    MyNode(float distance, int id) {
        this.distance = distance;
        this.id = id;
    }
}
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<MyNode> minHeap = new PriorityQueue<>(
    (a, b) -> Float.compare(a.distance, b.distance)
);
int count =0;
         for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            float dist = (float) Math.sqrt(x * x + y * y);
            minHeap.offer(new MyNode(dist, i));
        }

        int[][] res = new int[k][2];
       for (int i = 0; i < k; i++) {
            MyNode node = minHeap.poll();
            int index = node.id;

            res[i][0] = points[index][0];
            res[i][1] = points[index][1];
        }
return res;
    }
}
