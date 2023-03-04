/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Map<Integer,Integer> storemap;
    int preorderIndex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        storemap=new HashMap<>();
        for(int i=0;i<preorder.length;i++){
            storemap.put(inorder[i],i);
        }
        return somefun(preorder,0,preorder.length-1);
    }
    public TreeNode somefun(int[] preorder,int l,int r){
        if(l>r)
            return null;
        int rootv=preorder[preorderIndex++];
        TreeNode root=new TreeNode(rootv);
        root.left=somefun(preorder,l,storemap.get(rootv)-1);
        root.right=somefun(preorder,storemap.get(rootv)+1,r);        
        return root;
    }
}