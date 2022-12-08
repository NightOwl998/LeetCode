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
        List<Integer> leafs1=new ArrayList<>();
        List<Integer> leafs2=new ArrayList<>();
        visitTree(root1,leafs1);
        visitTree(root2,leafs2);
        return leafs1.equals(leafs2);
        
    }
    public void visitTree(TreeNode root,List<Integer> list )
    {
        if(root==null) return;
        if(root.left==null && root.right==null) list.add(root.val);
        else 
        {
            visitTree(root.left,list);
            visitTree(root.right,list);
        }
    }
}