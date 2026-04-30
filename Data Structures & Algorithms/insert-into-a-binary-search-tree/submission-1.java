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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        TreeNode inst = new TreeNode(val);
        rec(root,inst);
        return root;
    }
    public void rec(TreeNode root,TreeNode inst){
        if(inst.val<root.val && root.left==null){
            root.left=inst;
            return;
        }else if(inst.val>root.val && root.right==null){
            root.right=inst;
            return;
        }

        if(root!=null && inst.val>root.val){
            rec(root.right,inst);
        }else if(root!=null && inst.val<root.val){
            rec(root.left,inst);
        }
    }
}