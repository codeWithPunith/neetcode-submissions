

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
     int target=-1 ;
     int count=0;
     
    public int kthSmallest(TreeNode root, int k) {
    findele(root,k);
    return target;
    }
    private void findele(TreeNode root, int k){
       
        if(root==null||k<0) return ;
        findele(root.left,k);
        count++;
         if(k==count){
            target = root.val;
            return;
        }
        findele(root.right,k);
        
        return;
    }
}

