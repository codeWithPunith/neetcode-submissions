/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
         if (head == null || head.next == null) return head;
        ListNode pre = head.next;;
        ListNode cur = head.next.next;
        head.next=null;
        while(pre!=null){
            pre.next=head;
            head=pre;
            pre=cur;
            if(cur!=null){
                cur=cur.next;
            }
        }
      return head;
    }
    
}
