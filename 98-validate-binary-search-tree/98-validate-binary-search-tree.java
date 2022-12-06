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
     public  static int rootVal=0;

    public boolean isValidBST(TreeNode root) {
        
        
        if(root==null){return true;} //empty tree
        return isValidBSTMaxMin(root,Long.MIN_VALUE,Long.MAX_VALUE);
        }
    public boolean isValidBSTMaxMin(TreeNode root,long min,long max)
    {
        if(root==null) return true;
        if(root.left!=null && (root.val<=root.left.val || !(root.left.val>min) )) return false;
        if(root.right!=null && (root.val>=root.right.val || !(root.right.val<max) )) return false;
        return isValidBSTMaxMin(root.left,min,root.val) && isValidBSTMaxMin(root.right,root.val,max);
    }
        
        
        
    
}