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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> x=new ArrayList();
        ahhhINeedToCreateOneFunction(root,x);
        return x;
    }
    public  void ahhhINeedToCreateOneFunction(TreeNode t,List<Integer> main){
        if(t!=null){
            ahhhINeedToCreateOneFunction(t.left,main);
            main.add(t.val);
            ahhhINeedToCreateOneFunction(t.right,main);
        }
    }
}