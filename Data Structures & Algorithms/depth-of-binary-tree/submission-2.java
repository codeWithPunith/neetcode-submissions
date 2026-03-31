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
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> deq = new LinkedList<>();
        deq.add(root);
        int level =0;
        while(deq.size()>0 && root!=null){
            int s =deq.size();
            for(int i =0; i<s;i++){
                TreeNode pop = deq.remove();
                if(pop.right!=null) deq.add(pop.right);
                if(pop.left!=null) deq.add(pop.left);
            }
            level++;
        }
        return level; 
    }
}
