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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Deque<TreeNode> q = new LinkedList<>();
        String tree="";
        q.addLast(root);
        while(q.size()!=0){
            for(int i=0;i<q.size();i++){
            String val ="";
             TreeNode firstnode = q.poll();
             if(firstnode==null) val = "n";
             else {
                int num = firstnode.val;
                 val = String.valueOf(firstnode.val);
                q.add(firstnode.left);
                q.add(firstnode.right);
             }
             tree=tree+val+",";
            }
        }
    
        return tree;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
      String[] vals = data.split(",");
      HashMap<Integer,TreeNode> map = new HashMap<>();
      for(int i=0;i<vals.length;i++){
        if(!vals[i].equals("n")){
        int val =Integer.parseInt(vals[i]);
        map.put(i,new TreeNode(val));
      }}
     TreeNode root = map.get(0);
    int j = 1;

    for (int i = 0; i < vals.length; i++) {
        TreeNode parent = map.get(i);
        if (parent == null) continue;  

        if (j < vals.length) {
            parent.left = map.get(j++);
        }
        if (j < vals.length) {
            parent.right = map.get(j++);
        }
    }

      return root;
}}
