/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */



class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> nodes = new LinkedList<>();
        List<List<Integer>> ListNodes = new ArrayList<>();

        nodes.addFirst(root);
        while (!nodes.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            for (int i = nodes.size(); i > 0; i--) {
                TreeNode node = nodes.poll();
                if (node != null) {
                    list.add(node.val);
                    nodes.addLast(node.left);
                    nodes.addLast(node.right);
                }
            }
            if (!list.isEmpty()) ListNodes.add(list);
        }
        return ListNodes;
    }
}
