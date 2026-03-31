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
    ArrayList<Integer> binaryArray = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        insertArray(root);
         System.out.println(binaryArray);
        for(int i=1;i<binaryArray.size();i++){
            if(binaryArray.get(i)<=binaryArray.get(i-1)) return false;
        }
       
        return true;
    }
    private void insertArray(TreeNode node){
        if(node==null) return ;
        insertArray(node.left);
        binaryArray.add(node.val);
        insertArray(node.right);
        
    }
}
