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
public int diameterOfBinaryTree(TreeNode root) {
    int[] res = new int[1];
    dfs(root,res);
    return res[0];
}
private int dfs(TreeNode root, int[] res){
        int leftlen=1,rightlen=1;
         if(root==null) return 0;
    else{
        leftlen = leftlen+dfs(root.left,res);
        rightlen = rightlen+dfs(root.right,res);
        res[0]=Math.max(res[0],leftlen-1+rightlen-1);
        return Math.max(leftlen,rightlen);
        }
  
    }
}
