# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        s1,s2=head,head
        for i in range(n-1):
            s1 = s1.next
        prevOfs2=None
        while s1.next:
            s1=s1.next

            prevOfs2 = s2
            s2=s2.next
        if s2 is head:
            head = head.next
        else:
            prevOfs2.next = prevOfs2.next.next
        return head
        