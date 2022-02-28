# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        iwillstoreint=[]
        
        def recuIn(root1):
            if root1==None:
                return
            recuIn(root1.left)
            iwillstoreint.append(root1.val)
            recuIn(root1.right)
        recuIn(root)
        return iwillstoreint