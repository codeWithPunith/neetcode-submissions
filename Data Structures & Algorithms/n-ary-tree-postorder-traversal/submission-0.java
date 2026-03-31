/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    List<Integer> result = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        dfs(root);
        return result;
    }
    void dfs(Node root){
        if(root==null) return;
        for(Node n : root.children){
            dfs(n);
        }
        result.add(root.val);
    }
}