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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
    ListNode cur = l1;
    int multiplier=1;
    int sum1=0,sum2=0;
    while(cur!=null){
        sum1 +=(cur.val!=0)?(cur.val)*multiplier:sum1*10;
        multiplier*=10;
        cur=cur.next;
    }
    cur = l2;
    multiplier=1;
    while(cur!=null){
        sum2 +=(cur.val!=0)?(cur.val)*multiplier:1*sum2*10;
        multiplier*=10;
        cur=cur.next;
    }
    int finalboss = sum1+sum2;
    int check1=1;
    ListNode head = new ListNode(0);
    while(finalboss!=0){
        if((check1++)==1){
            head = new ListNode(finalboss%10);
            cur=head;
        }else{
            cur.next = new ListNode(finalboss%10);
            cur=cur.next;
        }
        finalboss=finalboss/10;
    }
    return head;
   
    }
}
