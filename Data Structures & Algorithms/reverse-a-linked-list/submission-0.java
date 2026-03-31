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

    ListNode pre = head.next;
    ListNode cur = pre.next;
    head.next = null; // break the original link

    while (pre != null) {
        pre.next = head;  // reverse link
        head = pre;       // move head forward
        pre = cur;        // move pre forward
        if (cur != null) {
            cur = cur.next; // move cur forward
        }
    }
    return head;
    }
    
}
