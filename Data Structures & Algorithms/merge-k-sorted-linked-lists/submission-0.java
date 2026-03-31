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
    public ListNode mergeKLists(ListNode[] lists) {
     int k =lists.length;
     ListNode dummy = null;
     for(int i=0;i<k;i++){
        dummy = merge(dummy,lists[i]);
     }
     return dummy;
    }
    public ListNode merge(ListNode head1,ListNode head2){
        ListNode l1 = head1;
        ListNode l2 = head2;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode head = null;
        ListNode cur = null;
        while(l1!=null && l2!=null){
            if(head==null){
                if(l1.val<=l2.val){
                    head=l1;
                    l1=l1.next;
                }else{
                    head=l2;
                    l2=l2.next;
                }
                cur = head;
            }else{
               if(l1.val<=l2.val){
                   cur.next= l1;
                    l1=l1.next;
                }else{
                    cur.next= l2;
                    l2=l2.next;
                } 
                cur =cur.next;
            }
           
        }
         if(l1==null && l2==null) return head;
            if(l1==null){
                cur.next = l2;
            }else{
                cur.next=l1;
            }
            return head;
    }
}
