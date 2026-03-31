/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> copy = new HashMap<>();
        copy.put(null,null);
        Node cur = head;
        while(cur!=null){
            copy.put(cur,new Node(cur.val));
            cur=cur.next;
        }
        cur = head;
        //Node copyhead = copy.get(head);
        while(cur!=null){
            Node Copy = copy.get(cur);
            Copy.next = copy.get(cur.next);
            Copy.random=copy.get(cur.random);
            cur=cur.next;
        }
        return copy.get(head);
    }
}
