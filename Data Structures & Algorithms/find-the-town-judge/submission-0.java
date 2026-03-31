class Solution {
    class Node{
        int i;
        List<Node> trust;
        Node(int i){
            this.i =i;
            this.trust = new ArrayList<>();
        }
    }
    public int findJudge(int n, int[][] trust) {
       HashMap<Integer,Node> map = new HashMap<>();
       for(int i=1;i<=n;i++){
          map.put(i,new Node(i));
       }
       for(int[] trusties : trust){
          Node trusty = map.get(trusties[1]);
          trusty.trust.add(map.get(trusties[0]));
       }
       for(Node node : map.values()){
        if(node.trust.size()==n-1 ) {
            for(Node newNode : map.values()){
                if(newNode.trust.contains(node)) return -1;
            }
            return node.i;
            }
       }
       return -1;
    }
}