class Solution {

    class Pair {
        int node;
        int cost;

        Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        // adjacency list
        List<List<Pair>> adj = new ArrayList<>();

        // initialize adjacency list
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // build graph
        for (int[] flight : flights) {

            int begin = flight[0];
            int end = flight[1];     // corrected: flight not fligth
            int price = flight[2];

            adj.get(begin).add(new Pair(end, price));
        }

        PriorityQueue<int[]> heap =
                new PriorityQueue<>((a, b) -> a[0] - b[0]);


             heap.offer(new int[]{0, src, 0});


            while (!heap.isEmpty()) {

                int[] ele = heap.poll();
                int weight = ele[0];
                int dest = ele[1];
                int stops = ele[2];
                if (dest == dst) {
                return weight;
                 }

                 if (stops > k) {
                continue;
            }
               
                  for (Pair nei : adj.get(dest)) {

                heap.offer(new int[]{
                        weight + nei.cost, 
                        nei.node,
                        stops + 1
                });
            }
            

          
        }

        return -1;
    }
}