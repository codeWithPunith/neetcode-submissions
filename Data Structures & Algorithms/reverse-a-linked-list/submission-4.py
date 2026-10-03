# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return None
        if head and head.next is None:
            return head
        dummy,cur = None,head
        while cur.next is not None:
            temp = cur.next

            cur.next = dummy
            dummy = cur
            cur = temp
        cur.next = dummy 
        return cur


        