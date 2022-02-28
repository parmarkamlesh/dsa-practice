# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        iwillstoreint=[]
        def recuPre(root1):
            if root1==None:
                return
            iwillstoreint.append(root1.val)
            recuPre(root1.left)
            recuPre(root1.right)
        recuPre(root)
        return iwillstoreint
        