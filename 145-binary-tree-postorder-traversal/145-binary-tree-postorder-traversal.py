# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        iwillstoreint=[]
        
        def recuPost(root1):
            if root1==None:
                return
            recuPost(root1.left)
            recuPost(root1.right)
            iwillstoreint.append(root1.val)
        recuPost(root)
        return iwillstoreint