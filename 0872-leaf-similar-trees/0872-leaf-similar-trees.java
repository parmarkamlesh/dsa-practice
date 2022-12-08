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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1=new ArrayList();
        List<Integer> l2=new ArrayList();

        travel(root1,l1);
        travel(root2,l2);
        
        return l1.equals(l2);
    }
    public void travel(TreeNode n,List<Integer> lv){
        if(n!=null){
            if(n.left==null && n.right==null){
                lv.add(n.val);
            }
            travel(n.left,lv);
            travel(n.right,lv);
        }
    }
}