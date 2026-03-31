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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null) return null;
     ListNode cur = head;
     ListNode prev = null;
     while(cur!=null){
        ListNode temp = cur.next;
        cur.next =prev;
        prev=cur;
        cur=temp;
     }
    if (n == 1) { 
            prev = prev.next; 
        } else {
            ListNode iterator = prev;
            for (int i = 1; i < n - 1; i++) {
                iterator = iterator.next;
            }
            iterator.next = iterator.next.next;
        }
     ListNode cur1=prev;
     ListNode prev1=null;
     while(cur1!=null){
        ListNode temp1 = cur1.next;
        cur1.next =prev1;
        prev1=cur1;
        cur1=temp1;
     }
     return prev1;
    }
}
