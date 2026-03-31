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
    int validator =1;
    boolean boolvalidator=true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        inorder(p,q);
        if(validator==1)return true;
        else return false;
    }
    private void inorder(TreeNode p , TreeNode q){
        if((p==null && q!=null )||(p!=null && q==null ) ){ 
           validator = 0;
            return; 
            }
            if(p==null || q==null) return ;
           inorder(p.left , q.left);
           boolvalidator = (p.val==q.val);
           if(!boolvalidator) validator =0;
           inorder(p.right, q.right);
    }
}
