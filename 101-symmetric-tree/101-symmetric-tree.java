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
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return false;
        }
        
        Stack<TreeNode> stk=new Stack();

        stk.push(root.left);
        stk.push(root.right);
        
        while(!stk.empty()){
            TreeNode one=stk.pop();
            TreeNode two=stk.pop();
            
            //if both null means its leaf
            if(one == null && two == null){
                continue;
            }
            //if anyone of null or value is not match means its not mirror
            if(one == null || two == null || one.val != two.val){
                return false;
            }
            
            //add all leaf node in stack
            stk.push(one.left);
            stk.push(two.right);            
            stk.push(one.right);
            stk.push(two.left);
        }
        
        return true;
    }
}