# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        fastp=head
        slowp=head
        while fastp and fastp.next is not None:
            slowp=slowp.next
            fastp=fastp.next.next
            if slowp==fastp:
                return True
        return False