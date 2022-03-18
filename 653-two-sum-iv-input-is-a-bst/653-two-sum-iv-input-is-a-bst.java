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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> al=new ArrayList();
        inorder(root,al);
//       System.out.println(Arrays.asList(hmap));
        for(int i = 0, j = al.size()-1; i<j;){
            if(al.get(i) + al.get(j) == k)return true;
            if(al.get(i) + al.get(j) < k)i++;
            else j--;
        }
        return false;        
    }
    public void inorder(TreeNode root, ArrayList<Integer> hmap){
    
        if(root==null)
            return;
        
        inorder(root.left,hmap);        
        hmap.add(root.val);
        inorder(root.right,hmap);

    }
}