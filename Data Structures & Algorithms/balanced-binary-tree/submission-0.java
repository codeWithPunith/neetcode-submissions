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
    boolean hb = true;
    public boolean isBalanced(TreeNode root) {
        int rootH = height(root);
        return hb;
    }
    private int height(TreeNode root){
    int leftHeight=1,rightHeight=1,diff=0;
        if(root==null) return 0;
        leftHeight=leftHeight+height(root.left);
        rightHeight=rightHeight+height(root.right);
        if(leftHeight>rightHeight){
            diff=leftHeight-rightHeight;
        }else if(leftHeight<rightHeight){
            diff=rightHeight-leftHeight;
        }

        if(diff>1) hb=false;
        return Math.max(leftHeight,rightHeight);
    }
}
