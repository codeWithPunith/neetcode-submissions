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
    ArrayList<Integer> arr1 = new ArrayList<>();
    ArrayList<Integer> arr2 = new ArrayList<>();
    int validator =1;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        inorder(p,q);
        if(arr1.size()!=arr2.size()|| validator==0) return false;
        boolean arreq = arr1.equals(arr2);
        return arreq;
    }
    private void inorder(TreeNode p , TreeNode q){
        if((p==null && q!=null )||(p!=null && q==null ) ){ 
           validator = 0;
            return; 
            }
            if(p==null || q==null) return ;
        inorder(p.left , q.left);
        arr1.add(p.val);
        arr2.add(q.val);
        inorder(p.right, q.right);
    }
}
