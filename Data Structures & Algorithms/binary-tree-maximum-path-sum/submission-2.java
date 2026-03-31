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
    TreeNode maxnode = new TreeNode(-1);
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        int maxSum = maxSum(root);
        System.out.println(maxSum);
        return max;
    }
    private int maxSum (TreeNode root){
        if(root==null) return 0;
        int left = Math.max(0,maxSum(root.left));
        int right = Math.max(0,maxSum(root.right));
        max=Math.max(max,root.val+left+right);
         return root.val + Math.max(left, right);
    }
}
