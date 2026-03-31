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
        int countleft=1,countright=1;
        if(root==null) return 0;
        else{
           countleft =countleft+maxDepth(root.left);
           countright =countright+maxDepth(root.right);
        }
        return Math.max(countleft,countright);
    }
}
